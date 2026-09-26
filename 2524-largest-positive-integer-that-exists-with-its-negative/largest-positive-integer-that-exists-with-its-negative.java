class Solution {
    public int findMaxK(int[] nums) {
        int max = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i]) && set.contains(-nums[i])) {
                max = Math.max(max,nums[i]);
            }
        }
        return max;
    }
}