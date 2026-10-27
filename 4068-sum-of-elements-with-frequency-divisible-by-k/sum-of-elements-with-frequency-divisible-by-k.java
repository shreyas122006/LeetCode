class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int freq[] = new int[101];
        int n = nums.length;
        for(int i=0; i<n; i++) {
            freq[nums[i]]++;
        }
        int sum = 0;
        for(int i=1; i<=100; i++) {
            if(freq[i] % k == 0) {
                sum += freq[i] * i;
            }
        }
        return sum;
    }
}