class Solution {
    private int GCD(int min, int max) {
        while(max != 0) {
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return GCD(min,max);
    }
}