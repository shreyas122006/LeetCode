class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        int n = nums.length; 
        for(int i=0; i<n; i++) {
            if(nums[i] == 0) {
                return 0;
            }
            if(nums[i] < 0) {
                neg++;
            }
        }
        return neg % 2 == 0? 1 : -1;
    }
}