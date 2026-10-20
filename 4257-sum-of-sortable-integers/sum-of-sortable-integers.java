class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] prefixMax = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixMax[i + 1] = Math.max(prefixMax[i], nums[i]);
        }
        int[] suffixMin = new int[n + 1];
        suffixMin[n] = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }
        int[] drops = new int[n];
        for (int i = 1; i < n; i++) {
            drops[i] = drops[i - 1] + (nums[i - 1] > nums[i] ? 1 : 0);
        }
        int sum = 0;
        for (int k = 1; k <= n / k; k++) {
            if (n % k == 0) {
                if (check(nums, prefixMax, suffixMin, drops, k)) {
                    sum += k;
                }
                int other = n / k;
                if (other != k && check(nums, prefixMax, suffixMin, drops, other)) {
                    sum += other;
                }
            }
        }
        return sum;
    }
    private boolean check(int[] nums, int[] prefixMax, int[] suffixMin, int[] drops, int k) {
        int n = nums.length;
        for (int start = 0; start < n; start += k) {
            int end = start + k - 1;
            int count = drops[end] - drops[start];
            if (nums[end] > nums[start]) {
                count++;
            }
            if (count > 1 || prefixMax[start] > suffixMin[start]) {
                return false;
            }
        }
        return true;
    }
}