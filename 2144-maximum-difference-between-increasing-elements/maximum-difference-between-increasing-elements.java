class Solution {
    public int maximumDifference(int[] nums) {
        long maxDiff = Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j] - nums[i] > 0) {
                    maxDiff = Math.max(maxDiff, nums[j] - nums[i]);
                }
            }
        }
        return maxDiff == Long.MIN_VALUE ? -1 : (int)maxDiff;
    }
}