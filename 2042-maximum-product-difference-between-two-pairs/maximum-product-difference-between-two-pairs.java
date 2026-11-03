class Solution {
    public int maxProductDifference(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // return (nums[n-1]*nums[n-2]) - (nums[1]*nums[0]);
        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            if(max1 <= nums[i]) {
                max2 = max1;
                max1 = nums[i];
            } else if(nums[i] > max2) {
                max2 = nums[i];
            }
             if(min1 >= nums[i]) {
                min2 = min1;
                min1 = nums[i];
            } else if(nums[i] < min2) {
                min2 = nums[i];
            }
        }
        return (max2*max1) - (min2*min1);
    }
}