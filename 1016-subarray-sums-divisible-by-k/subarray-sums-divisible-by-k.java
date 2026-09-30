class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] rem = new int[k];
        rem[0] = 1;
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            int r = sum % k;
            if (r < 0) {
                r += k;
            }
            count += rem[r];
            rem[r]++;
        }
        return count;
    }
}