class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] store = new int[2];
        int freq[] = new int[101];
        for(int i=0; i<nums.length; i++) {
            freq[nums[i]]++;
        }
        int idx = 0;
        for(int i=0; i<101; i++) {
            if(freq[i] == 2 && idx != 2) {
                store[idx] = i;
                idx++;
            }
        }
        return store;
    }
}