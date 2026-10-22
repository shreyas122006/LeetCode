class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }
        int store = Integer.MAX_VALUE;
        for (int step : new int[]{1, -1}) {
            boolean valid = true;
            for (int i = 1; i < n; i++) {
                int prev = (zero + (i - 1) * step + n) % n;
                int curr = (zero + i * step + n) % n;
                if (nums[prev] > nums[curr]) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                if (step == 1) {
                    store = Math.min(store, zero);
                    store = Math.min(store, n - zero + 2);
                } else {
                    store = Math.min(store, zero + 2);
                    store = Math.min(store, n - zero);
                }
            }
        }
        return store == Integer.MAX_VALUE ? -1 : store;
    }
}
