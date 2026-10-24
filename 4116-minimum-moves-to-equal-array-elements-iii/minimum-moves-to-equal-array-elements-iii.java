class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        if(n == 1) {
            return 0;
        }
        int max = 0;
        for(int i=0; i<n; i++) {
            max = Math.max(max,nums[i]);
        }
        int req = 0;
        for(int i=0; i<n; i++) {
            req += Math.abs(max - nums[i]);
        }
        return req;
    }
}