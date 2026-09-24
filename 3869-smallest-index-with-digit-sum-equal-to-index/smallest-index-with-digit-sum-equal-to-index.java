class Solution {
    public int smallestIndex(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            while(nums[i]>0) {
                sum += nums[i]%10;
                nums[i] /= 10;
            }
            if(sum == i) {
                return sum;
            }
            sum = 0;
        }
        return -1;
    }
}