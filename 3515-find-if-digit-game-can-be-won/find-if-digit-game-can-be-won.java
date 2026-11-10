class Solution {
    public boolean canAliceWin(int[] nums) {
        // int singleSum = 0;
        // int doubleSum = 0;
        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i] > 9) {
        //         doubleSum += nums[i];
        //     } else {
        //         singleSum += nums[i];
        //     }
        // }
        // return doubleSum == singleSum ? false : true;

        // int total = 0;
        // int Dsum = 0;
        // for(int num : nums) {
        //     if(num > 9) {
        //         Dsum += num;
        //         total += num;
        //     } else {
        //         total += num;
        //     }
        // }
        // return total - Dsum == Dsum ? false : true;

        int Ssum = 0;
        int Dsum = 0;
        for(int num : nums) {
            if(num > 9) {
                Dsum += num;
            } else {
                Ssum += num;
            }
        }
        return Ssum == Dsum ? false : true;
    }
}