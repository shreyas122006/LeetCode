class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = (nums.length*(nums.length+1))/2;
        for(int i=0; i<nums.length; i++) {
            totalSum -= nums[i];
        }
        return totalSum;
    }
}