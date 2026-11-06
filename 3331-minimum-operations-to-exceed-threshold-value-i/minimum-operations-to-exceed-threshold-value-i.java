class Solution {
    public int minOperations(int[] nums, int k) {
        // int min = 0;
        // int i=0;
        // int n = nums.length;
        // for(i=0; i<n; i++) {
        //     if(nums[i]<k) {
        //         min++;
        //     }
        // }
        // return min;
        int min = 0;
        for(int num:nums) {
            if(num<k) {
                min++;
            }
        }
        return min;
    }
}