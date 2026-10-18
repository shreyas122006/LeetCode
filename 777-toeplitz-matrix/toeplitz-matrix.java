class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length; 
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int x = i;
                int y = j;
                int curr = matrix[x][y];
                for(int k=x; k<n; k++) {
                    if(x+1 < n && y+1 < m) {
                        if(curr != matrix[x+1][y+1]) {
                            return false;
                        } else {
                            x++;
                            y++;
                        }
                    }
                }
            }
        }
        return true;
    }
}