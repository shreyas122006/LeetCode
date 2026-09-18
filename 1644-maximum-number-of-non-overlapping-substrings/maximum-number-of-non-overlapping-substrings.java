class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, n);
        Arrays.fill(last, -1);
        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - 'a';

            first[ch] = Math.min(first[ch], i);
            last[ch] = i;
        }
        List<int[]> ranges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - 'a';
            if (i != first[ch]) {
                continue;
            }
            int end = last[ch];
            boolean valid = true;
            for (int j = i; j <= end; j++) {
                int curr = s.charAt(j) - 'a';
                if (first[curr] < i) {
                    valid = false;
                    break;
                }
                end = Math.max(end, last[curr]);
            }
            if (valid) {
                ranges.add(new int[]{i, end});
            }
        }
        ranges.sort((a, b) -> a[1] - b[1]);
        List<String> store = new ArrayList<>();
        int prevEnd = -1;
        for (int[] range : ranges) {
            int start = range[0];
            int end = range[1];
            if (start > prevEnd) {
                store.add(s.substring(start, end + 1));
                prevEnd = end;
            }
        }
        return store;
    }
}