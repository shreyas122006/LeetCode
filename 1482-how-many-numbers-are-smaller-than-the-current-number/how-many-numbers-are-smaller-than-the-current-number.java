class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int store[] = new int[n];
        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=0; j<n; j++) {
                if(j!=i && nums[i] > nums[j]) {
                    count++;
                }
            }
            store[i] = count;
        }
        return store;
    }
}