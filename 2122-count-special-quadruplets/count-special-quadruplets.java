class Solution {
    public int countQuadruplets(int[] nums) {
        int first = nums[0];
        int second = nums[1];
        int third = nums[2];
        int fourth = nums[3];
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    for(int l=k+1; l<nums.length; l++) {
                        if(nums[i] + nums[j] + nums[k] == nums[l]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}