class Solution {
    public int findNonMinOrMax(int[] nums) {
        // int n = nums.length;
        // if(n <= 2) {
        //     return -1;
        // }
        // Arrays.sort(nums);
        // return nums[1];

        int n = nums.length;
        if(n <= 2) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // for(int i=0; i<n; i++) {
        //     min = Math.min(min, nums[i]);
        //     max = Math.max(max, nums[i]);
        // }

        for(int i=0; i<n; i++) {
            if(min > nums[i]) {
                min = nums[i];
            }
            if(max < nums[i]) {
                max = nums[i];
            }
        }
        for(int i=0; i<n; i++) {
            if(nums[i] != min && nums[i] != max) {
                return nums[i];
            }
        }
        return -1;
    }
}