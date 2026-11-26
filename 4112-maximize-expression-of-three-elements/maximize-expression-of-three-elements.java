// class Solution {
//     public int maximizeExpressionOfThree(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         return Math.max(nums[n-1] + nums[n-2] - nums[0], nums[0] + nums[1] - nums[n-1]);
//     }
// }
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n = nums.length;
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            if(nums[i] > a) {
                b = a;
                a = nums[i];
            }
            else if(nums[i] > b) {
                b = nums[i];
            }
            if(nums[i] < c) {
                c = nums[i];
            }
        }
        return a+b-c;
    }
}