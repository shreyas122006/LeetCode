class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int freq[] = new int[51];
        for(int i=0; i<nums.length; i++) {
            freq[nums[i]]++;
        }
        int totXOR = 0;
        for(int i=1; i<51; i++) {
            if(freq[i] == 2) {
                totXOR ^= i;
            }
        }
        return totXOR;
    }
}