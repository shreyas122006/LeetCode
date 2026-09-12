class Solution {
    class Interval {
        int start, end, weight, index;

        Interval(int start, int end, int weight, int index) {
            this.start = start;
            this.end = end;
            this.weight = weight;
            this.index = index;
        }
    }
    class Result {
        long score;
        ArrayList<Integer> indices;

        Result(long score, ArrayList<Integer> indices) {
            this.score = score;
            this.indices = indices;
        }
    }
    Interval[] arr;
    Result[][] dp;
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        arr = new Interval[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Interval(
                intervals.get(i).get(0),
                intervals.get(i).get(1),
                intervals.get(i).get(2),
                i
            );
        }
        // Sort by start time
        Arrays.sort(arr, (a, b) -> {
            if (a.start != b.start)
                return Integer.compare(a.start, b.start);
            return Integer.compare(a.end, b.end);
        });
        dp = new Result[n][5];
        Result ans = solve(0, 4);
        int[] result = new int[ans.indices.size()];
        for (int i = 0; i < ans.indices.size(); i++) {
            result[i] = ans.indices.get(i);
        }

        return result;
    }
    Result solve(int pos, int left) {
        if (pos == arr.length || left == 0) {
            return new Result(0, new ArrayList<>());
        }
        if (dp[pos][left] != null) {
            return dp[pos][left];
        }
        // Don't take current interval
        Result skip = solve(pos + 1, left);
        // Take current interval
        int next = findNext(pos);
        Result nextResult = solve(next, left - 1);
        ArrayList<Integer> takeIndices =
            new ArrayList<>(nextResult.indices);
        takeIndices.add(arr[pos].index);
        Collections.sort(takeIndices);
        Result take = new Result(
            arr[pos].weight + nextResult.score,
            takeIndices
        );
        // Choose better result
        if (take.score > skip.score) {
            dp[pos][left] = take;
        }
        else if (take.score < skip.score) {
            dp[pos][left] = skip;
        }
        else {
            // Same score -> lexicographically smaller indices
            if (compare(take.indices, skip.indices) < 0) {
                dp[pos][left] = take;
            }
            else {
                dp[pos][left] = skip;
            }
        }
        return dp[pos][left];
    }
    // First interval whose start > current end
    int findNext(int pos) {
        int target = arr[pos].end;
        int low = pos + 1;
        int high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid].start > target) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
    // Lexicographical comparison
    int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
        int n = Math.min(a.size(), b.size());
        for (int i = 0; i < n; i++) {
            if (!a.get(i).equals(b.get(i))) {
                return Integer.compare(a.get(i), b.get(i));
            }
        }
        return Integer.compare(a.size(), b.size());
    }
}