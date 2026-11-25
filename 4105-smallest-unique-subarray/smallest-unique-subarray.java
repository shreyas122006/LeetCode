class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        int left = 1;
        int right = nums.length;
        int answer = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(nums, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
    private boolean check(int[] nums, int len) {
        long mod1 = 1000000007;
        long mod2 = 1000000009;
        long base = 911382323;
        long power1 = 1;
        long power2 = 1;
        for (int i = 1; i < len; i++) {
            power1 = (power1 * base) % mod1;
            power2 = (power2 * base) % mod2;
        }
        long hash1 = 0;
        long hash2 = 0;
        for (int i = 0; i < len; i++) {
            hash1 = (hash1 * base + nums[i]) % mod1;
            hash2 = (hash2 * base + nums[i]) % mod2;
        }
        HashMap<Long, Integer> map = new HashMap<>();
        long key = (hash1 << 32) | hash2;
        map.put(key, 1);
        for (int i = len; i < nums.length; i++) {
            hash1 = (hash1 - (nums[i - len] * power1) % mod1 + mod1) % mod1;
            hash1 = (hash1 * base + nums[i]) % mod1;
            hash2 = (hash2 - (nums[i - len] * power2) % mod2 + mod2) % mod2;
            hash2 = (hash2 * base + nums[i]) % mod2;
            key = (hash1 << 32) | hash2;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (int count : map.values()) {
            if (count == 1) {
                return true;
            }
        }
        return false;
    }
}