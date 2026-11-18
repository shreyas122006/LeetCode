// class Solution {
//     public int maxAdjacentDistance(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         for(int i=1; i<nums.length; i++) {
//             max = Math.max(max, Math.abs(nums[i] - nums[i-1]));
//         }
//         return Math.max(max, Math.abs(nums[0] - nums[nums.length-1]));
//     }
// }


class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max = Math.abs(nums[0] - nums[n-1]);
        for(int i=1; i<n; i++) {
            int currDiff = Math.abs(nums[i] - nums[i-1]);
            if(max < currDiff) {
                max = currDiff;
            }
        }
        return max;
    }
}