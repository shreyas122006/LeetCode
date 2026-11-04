class Solution {

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;

        TreeMap<Integer, Integer> left = new TreeMap<>();
        TreeMap<Integer, Integer> right = new TreeMap<>();

        long leftSum = 0, rightSum = 0;
        int leftSize = 0, rightSize = 0;

        long[] cost = new long[n - x + 1];

        for (int i = 0; i < n; i++) {

            int val = nums[i];

            if (left.isEmpty() || val <= left.lastKey()) {
                left.merge(val, 1, Integer::sum);
                leftSum += val;
                leftSize++;
            } else {
                right.merge(val, 1, Integer::sum);
                rightSum += val;
                rightSize++;
            }

            // Remove element outside the window
            if (i >= x) {
                int remove = nums[i - x];

                if (left.containsKey(remove)) {
                    left.merge(remove, -1, Integer::sum);
                    if (left.get(remove) == 0) {
                        left.remove(remove);
                    }
                    leftSum -= remove;
                    leftSize--;
                } else {
                    right.merge(remove, -1, Integer::sum);
                    if (right.get(remove) == 0) {
                        right.remove(remove);
                    }
                    rightSum -= remove;
                    rightSize--;
                }
            }

            // Balance the two halves
            while (leftSize > rightSize + 1) {
                int move = left.lastKey();

                left.merge(move, -1, Integer::sum);
                if (left.get(move) == 0) left.remove(move);

                right.merge(move, 1, Integer::sum);

                leftSum -= move;
                rightSum += move;

                leftSize--;
                rightSize++;
            }

            while (leftSize < rightSize) {
                int move = right.firstKey();

                right.merge(move, -1, Integer::sum);
                if (right.get(move) == 0) right.remove(move);

                left.merge(move, 1, Integer::sum);

                rightSum -= move;
                leftSum += move;

                rightSize--;
                leftSize++;
            }

            if (i >= x - 1) {
                int median = left.lastKey();

                cost[i - x + 1] =
                    (long) median * leftSize - leftSum
                    + rightSum - (long) median * rightSize;
            }
        }

        // DP
        long INF = Long.MAX_VALUE / 4;
        long[][] dp = new long[k + 1][n + 1];

        for (int i = 0; i <= k; i++) {
            Arrays.fill(dp[i], INF);
        }

        dp[0][0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {

                if (dp[j][i] == INF) continue;

                dp[j][i + 1] = Math.min(
                    dp[j][i + 1], dp[j][i]
                );

                if (j < k && i + x <= n) {
                    dp[j + 1][i + x] = Math.min(
                        dp[j + 1][i + x],
                        dp[j][i] + cost[i]
                    );
                }
            }
        }

        return dp[k][n];
    }
}