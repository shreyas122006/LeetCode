class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        if(n==1) {
            return new int[]{0};
        }
        int store[] = new int[n];
        for(int i=0; i<n; i++) {
            boolean isOdd = false;
            if(nums[i] % 2 == 1) {
                isOdd = true;
            }
            for(int j=i+1; j<n; j++) {
                if((isOdd && nums[j] % 2 == 0) || (!isOdd && nums[j] % 2 == 1)) {
                    store[i]++;
                }
            }
        }
        return store;
    }
}