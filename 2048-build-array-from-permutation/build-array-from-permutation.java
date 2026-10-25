class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int store[] = new int[n];
        for(int i=0; i<n; i++) {
            store[i] = nums[nums[i]];
        }
        return store;
    }
}