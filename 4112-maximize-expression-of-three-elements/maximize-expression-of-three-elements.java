class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1] + nums[n-2] - nums[0], nums[0] + nums[1] - nums[n-1]);
    }
}