class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if (k == n) { // return max among all
            int max = 0;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        int[] freq = new int[51]; //count freq for all nums
        for (int num : nums) {
            freq[num]++;
        }
        if (k == 1) { //single element window, return missing
            for (int i = 50; i >= 0; i--) {
                if (freq[i] == 1) {
                    return i;
                }
            }
            return -1;
        }
        int ans = -1;
        if (freq[nums[0]] == 1) { 
            ans = nums[0];
        }
        if (freq[nums[n - 1]] == 1) { 
            ans = Math.max(ans, nums[n - 1]); //both start and end freq is 1 then return max
        }
        return ans; 
    }
}