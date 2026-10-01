class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int[] row : matrix) {
            StringBuilder sb = new StringBuilder();
            for (int num : row) {
                if (row[0] == 1) {
                    sb.append(num);
                } else {
                    sb.append(1 - num);
                }
            }
            String key = sb.toString();
            map.put(key, map.getOrDefault(key, 0) + 1);
            max = Math.max(max, map.get(key));
        }
        return max;
    }
}