class Solution {
    public int countNegatives(int[][] grid) {
        // int col = grid[0].length-1;
        // int row = 0;
        // int count = 0;
        // while(col >= 0 && row <= grid.length-1) {
        //     if(grid[row][col] < 0) {
        //         count++;
        //         col--;
        //     } else {
        //         row++;
        //         col = grid[0].length-1;
        //     }  
        // }
        // return count;
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}