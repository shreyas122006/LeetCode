class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        int[][] cost = new int[n][n];
        // Precompute cost for every substring
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len <= n; i++) {
                int best = Integer.MAX_VALUE;
                // Try every proper divisor
                for (int d = 1; d < len; d++) {
                    if (len % d != 0) {
                        continue;
                    }
                    int changes = 0;
                    // Check each group
                    for (int r = 0; r < d; r++) {
                        int count = (len - 1 - r) / d + 1;
                        for (int t = 0; t < count / 2; t++) {
                            int left = i + r + t * d;
                            int right = i + r + (count - 1 - t) * d;
                            if (s.charAt(left) != s.charAt(right)) {
                                changes++;
                            }
                        }
                    }
                    best = Math.min(best, changes);
                }
                cost[i][i + len - 1] = best;
            }
        }
        // DP: dp[p][i] = minimum changes to partition
        // first i characters into p semi-palindromes
        int[][] dp = new int[k + 1][n + 1];
        for (int[] row : dp) {
            java.util.Arrays.fill(row, Integer.MAX_VALUE / 2);
        }
        dp[0][0] = 0;
        for (int p = 1; p <= k; p++) {
            for (int i = 2 * p; i <= n; i++) {
                // Last substring starts at j
                for (int j = 2 * (p - 1); j <= i - 2; j++) {
                    dp[p][i] = Math.min(
                        dp[p][i],
                        dp[p - 1][j] + cost[j][i - 1]
                    );
                }
            }
        }
        return dp[k][n];
    }
}