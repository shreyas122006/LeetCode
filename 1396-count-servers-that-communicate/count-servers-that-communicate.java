class Solution {
    public boolean contains(int[][] grid, int col, int n) {
        int count = 0;
        for(int j=0; j<n; j++) {
            if(grid[j][col] == 1) {
                count++;
            }
        }
        return (count == 1)? false : true;
    }
    public int countServers(int[][] grid) {
        int totalCount = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<n; i++) {
            int count = 0;
            int col = 0;
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 1) {
                    count++;
                    col = j;
                }
            }
            if(count == 1 && !contains(grid, col, n)) {
                count -= 1;
            }
            totalCount += count;
        }
        return totalCount;
    }
}