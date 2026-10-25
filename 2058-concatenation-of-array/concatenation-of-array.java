class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = 2*nums.length;
        int store[] = new int[n];
        int j = 0;
        for(int i=0; i<n/2; i++) {
            store[i] = nums[j++];
        }
        j=0;
        for(int i=n/2; i<n; i++) {
            store[i] = nums[j++];
        }
        return store;
    }
}