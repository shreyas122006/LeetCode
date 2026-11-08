class Solution {
    public boolean contains(int[][] grid, int col) {
        int count = 0;
        for(int j=0; j<grid.length; j++) {
            if(grid[j][col] == 1) {
                count++;
            }
        }
        return (count == 1)? false : true;
    }
    public int countServers(int[][] grid) {
        int totalCount = 0;
        for(int i=0; i<grid.length; i++) {
            int count = 0;
            int col = 0;
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    count++;
                    col = j;
                }
            }
            if(count == 1 && !contains(grid, col)) {
                count -= 1;
            }
            totalCount += count;
        }
        return totalCount;
    }
}