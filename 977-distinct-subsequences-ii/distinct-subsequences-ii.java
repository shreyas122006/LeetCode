class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007; // Reset if very large
        long dp[] = new long[26];
        for(char c : s.toCharArray()) {
            int i = c - 'a';
            long total = 1; 
            for(long x : dp) {
                total = (total + x) % MOD;
            }
            dp[i] = total; 
        }

        long store = 0;
        for(long x : dp) {
            store = (store + x) % MOD;
        }
        return (int) store;
    }
}