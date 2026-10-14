class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] store = new int[2];
        int freq[] = new int[nums.length+2];
        for(int i=0; i<nums.length; i++) {
            freq[nums[i]]++;
        }
        int idx = 0;
        for(int i=0; i<nums.length+2; i++) {
            if(freq[i] == 2) {
                store[idx] = i;
                idx++;
            }
        }
        return store;
    }
}