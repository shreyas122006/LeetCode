class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // if(r*c > mat.length*mat[0].length || r*c < mat.length*mat[0].length) {
        //     return mat;
        // }
        // int[][] store = new int[r][c];
        // ArrayList<Integer> temp = new ArrayList<>();
        // for(int i=0; i<mat.length; i++) {
        //     for(int j=0; j<mat[0].length; j++) {
        //         temp.add(mat[i][j]);
        //     }
        // }
        // int x = 0;
        // for(int i=0; i<r; i++) {
        //     for(int j=0; j<c; j++) {
        //         store[i][j] = temp.get(x);
        //         x++;
        //     }
        // }
        // return store;


        int n = mat.length;
        int m = mat[0].length;
        if(r*c > n*m || r*c < n*m) {
            return mat;
        }
        int store[][] = new int[r][c];
        int k = 0;
        int l = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                store[k][l] = mat[i][j];
                l++;
                if(l == c) {
                    l = 0;
                    k++;
                }
            }
        }
        return store;
    }
}