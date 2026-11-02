class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        // int mid = 0;
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int minMoves = 0;
        while(i<j) {
            minMoves += nums[j] - nums[i];
            j--;
            i++;
        }
        return minMoves;
        // if(n % 2 == 1) {
        //     mid = n/2;
        //     return nums[mid];
        // } else {
        //     int absDiff = 0;
        //     for(int i=1; i<n; i++) {
        //         absDiff += Math.abs(nums[i-1] - nums[i]);
        //     }
        //     return absDiff + (int)Math.ceil((nums[(n-1)/2] + nums[(n+1)/2])/2);
        // }
    }
}