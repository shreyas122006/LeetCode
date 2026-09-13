class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int opMat[][] = new int[m][n];
        int count = 0;
        for(int i=0; i<indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for(int k=0; k<n; k++) {
                opMat[row][k]++;
            }
            for(int l=0; l<m; l++) {
                opMat[l][col]++;
            }
        }
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(opMat[i][j]%2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}