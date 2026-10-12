class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bitCount = new int[31];
        int mod = 1_000_000_007;
        for (int num : nums) {
            for (int bit = 0; bit < 31; bit++) {
                if ((num & (1 << bit)) != 0) {
                    bitCount[bit]++;
                }
            }
        }
        long total = 0;
        for (int i = 0; i < k; i++) {
            long curr = 0;
            for (int bit = 0; bit < 31; bit++) {
                if (bitCount[bit] > 0) {
                    curr |= (1L << bit);
                    bitCount[bit]--;
                }
            }
            total = (total + curr * curr) % mod;
        }
        return (int) total;
    }
}