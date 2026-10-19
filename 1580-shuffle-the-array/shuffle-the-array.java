class Solution {
    public int[] shuffle(int[] nums, int n) {
        int store[] = new int[2*n];
        int l = 0;
        int k = 0;
        for(int i=0; i<2*n; i++) {
            if(i%2 == 0) {
                store[i] = nums[l];
                l++;
            } else {
                store[i] = nums[n+k];
                k++;
            }
        }
        return store;
    }
}