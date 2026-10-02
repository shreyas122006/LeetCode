class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int store[][] = new int[n-2][m-2];

        for(int i=0; i<n-2; i++) {
            for(int j=0; j<m-2; j++) {
                int max = 0;
                for(int k=i; k<i+3; k++) {
                    for(int l=j; l<j+3; l++) {
                        max = Math.max(max,grid[k][l]);
                    }
                }
                store[i][j] = max;
            }
        }
        return store;
    }
}