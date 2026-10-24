class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = 2*nums.length;
        int store[] = new int[n];
        for(int i=0; i<n/2; i++) {
            store[i] = nums[i];
        }
        for(int i=n/2; i<n; i++) {
            store[i] = nums[n-i-1];
        }
        return store;
    }
}