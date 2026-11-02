class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int minMoves = 0;
        while(i<j) {
            minMoves += nums[j--] - nums[i++];
        }
        return minMoves;
    }
}