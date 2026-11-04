class Solution {
    public int[] transformArray(int[] nums) {
        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i]%2 == 0) {
        //         nums[i] = 0;
        //     } else {
        //         nums[i] = 1;
        //     }
        // }
        // Arrays.sort(nums);
        // return nums;
        int countE = 0;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(nums[i] % 2 == 0) {
                countE++;
            }
        }
        int idx = 0;
        while(countE!=0) {
            nums[idx++] = 0;
            countE--;
        }
        while(idx != n) {
            nums[idx++] = 1;
        }
        return nums;
    }
}