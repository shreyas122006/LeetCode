class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if(n==1) {
            return 0;
        }
        int minMoves = 0;
        int curr = nums[0];
        for(int i=1; i<n; i++) {
            if(curr >= nums[i]) {
                minMoves += Math.abs(curr - nums[i]) + 1;
                curr++;
            } else {
                curr = nums[i];
            }
        }
        return minMoves;

    }
}