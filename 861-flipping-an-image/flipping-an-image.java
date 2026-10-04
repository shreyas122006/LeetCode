class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        int store[][] = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                store[i][j] = image[i][m-j-1];
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(store[i][j] == 0) {
                    store[i][j] = 1;
                } else {
                    store[i][j] = 0;
                }
            }
        }
        return store;
    }
}