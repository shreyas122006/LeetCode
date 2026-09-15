class Solution {
    boolean[][] pal;
    int[] dp;
    int n, k;
    public int maxPalindromes(String s, int k) {
        n = s.length();
        this.k = k;
        pal = new boolean[n][n];
        dp = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            pal[i][i] = true;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i == 1 || pal[i + 1][j - 1]) {
                        pal[i][j] = true;
                    }
                }
            }
        }
        return solve(s, 0);
    }
    int solve(String s, int i) {
        if (i >= n) {
            return 0;
        }
        if (dp[i] != 0) {
            return dp[i];
        }
        int maxCount = solve(s, i + 1);
        for (int j = i + k - 1; j < n; j++) {
            if (pal[i][j]) {
                maxCount = Math.max(maxCount, 1 + solve(s, j + 1));
            }
        }
        dp[i] = maxCount;
        return maxCount;
    }
}