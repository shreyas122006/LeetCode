class Solution {
    public long maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long M = 100000L;
        long ans1 = (long) nums[0]*nums[1]*M;
        long ans2 = (long) nums[0]*nums[n-1]*(-M);
        long ans3 = (long) nums[n-2]*nums[n-1] * M;
        return Math.max(ans1,Math.max(ans2,ans3));
        // return (long) Math.max(nums[0]*nums[1]*100000,Math.max(nums[0]*(-100000)*nums[n-1],Math.max(100000*nums[n-2]*nums[n-1],Math.max(nums[0]*(-100000)*nums[n-1],100000*nums[n-2]*nums[n-1]))));
    }
}