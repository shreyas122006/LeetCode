class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] store = new int[2];
        int n = grid.length;
        int freq[] = new int[2501];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                freq[grid[i][j]]++;
            }
        }
        for(int i=1; i<=grid.length*grid.length; i++) {
            if(freq[i] == 0) {
                store[1] = i;
            } else if(freq[i] == 2) {
                store[0] = i;
            }
        }
        return store;
    }
}