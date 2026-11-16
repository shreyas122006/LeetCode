class Solution {
    public int maxDigitRange(int[] nums) {
        // if(nums.length == 1) {
        //     return nums[0];
        // }
        int maxRange = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            int curr = nums[i];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while(curr > 0) {
                min = Math.min(min, curr % 10);
                max = Math.max(max, curr % 10);
                curr /= 10;
            }
            maxRange = Math.max(maxRange, max-min);
        }
        for(int i=0; i<nums.length; i++) {
            int curr = nums[i];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while(curr > 0) {
                min = Math.min(min, curr % 10);
                max = Math.max(max, curr % 10);
                curr /= 10;
            }
            if(max - min == maxRange) {
                sum += nums[i];
            }
        }
        return sum;
    }
}