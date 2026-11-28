class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if(max < num) {
                max = num;
            }
        }
        int sum = 0;
        while(k>0) {
            sum += max;
            max++;
            k--;
        }
        return sum;
    }
}