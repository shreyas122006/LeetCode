class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c > mat.length*mat[0].length || r*c < mat.length*mat[0].length) {
            return mat;
        }
        int[][] store = new int[r][c];
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                temp.add(mat[i][j]);
            }
        }
        int x = 0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                store[i][j] = temp.get(x);
                x++;
            }
        }
        return store;
    }
}