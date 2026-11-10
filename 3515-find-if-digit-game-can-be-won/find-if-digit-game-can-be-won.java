class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum = 0;
        int doubleSum = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 9) {
                doubleSum += nums[i];
            } else {
                singleSum += nums[i];
            }
        }
        return doubleSum == singleSum ? false : true;
    }
}