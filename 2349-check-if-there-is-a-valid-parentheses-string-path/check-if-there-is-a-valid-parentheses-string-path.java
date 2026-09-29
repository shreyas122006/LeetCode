class Solution {
    int m, n;
    Boolean[][][] dp;
    public boolean hasValidPath(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        // Path length must be even
        if ((m + n - 1) % 2 != 0) {
            return false;
        }
        // Valid parentheses string cannot start with ')' 
        // or end with '('
        if (grid[0][0] == ')' || grid[m - 1][n - 1] == '(') {
            return false;
        }
        dp = new Boolean[m][n][m + n];
        return dfs(grid, 0, 0, 0);
    }
    private boolean dfs(char[][] grid, int i, int j, int balance) {
        if (i >= m || j >= n) {
            return false;
        }
        // Update balance
        if (grid[i][j] == '(') {
            balance++;
        } else {
            balance--;
        }
        // ')' cannot make balance negative
        if (balance < 0) {
            return false;
        }
        // Reached destination
        if (i == m - 1 && j == n - 1) {
            return balance == 0;
        }
        if (dp[i][j][balance] != null) {
            return dp[i][j][balance];
        }
        boolean down = dfs(grid, i + 1, j, balance);
        boolean right = dfs(grid, i, j + 1, balance);
        return dp[i][j][balance] = down || right;
    }
}