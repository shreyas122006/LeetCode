class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        leftSum[0] = 0;
        rightSum[n-1] = 0;
        for(int i=1; i<n; i++) {
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        for(int j=n-1; j>=1; j--) {
            rightSum[j-1] = rightSum[j] + nums[j];
        }
        for(int i=0; i<n; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return nums;
    }
}