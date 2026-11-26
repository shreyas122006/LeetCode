class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        boolean isPos = false;
        for(int i=0; i<nums.length; i++) {
            if(Math.abs(nums[i]) < min) {
                min = Math.abs(nums[i]);
                if(nums[i] < 0) {
                    isPos = false;
                } else {
                    isPos = true;
                }
            }
            if(nums[i] == min) {
                isPos = true;
            }
        }
        if(isPos) {
            return min;
        } else {
            return -min;
        }
    }
}