class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = 0;
        int req = 0;
        for(int i=0; i<n; i++) {
            req += nums[i];
            max = Math.max(max,nums[i]);
        }
        return (max * n) - req;
    }
}