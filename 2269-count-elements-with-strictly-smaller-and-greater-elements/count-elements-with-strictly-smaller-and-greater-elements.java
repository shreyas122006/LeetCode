class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        int n = nums.length;
        int i=0;
        int j=0;
        for(i=0 ; i<n; i++) {
            boolean strictGreat = false;
            boolean strictSmall = false;
            for(j=0 ; j<n; j++) {
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