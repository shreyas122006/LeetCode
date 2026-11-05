class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            boolean strictGreat = false;
            boolean strictSmall = false;
            for(int j=0; j<nums.length; j++) {
                if(i!=j && nums[i] > nums[j]) {
                    strictGreat = true;
                }else if(i!=j && nums[i] < nums[j]) {
                    strictSmall = true;
                }
            }
            if(strictGreat && strictSmall) {
                count++;
            }
        }
        return count;
    }
}