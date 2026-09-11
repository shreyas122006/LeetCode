class Solution {
    public static int getIntLengthLog(int number) {
        if (number == 0) return 1;
        long n = Math.abs((long) number); 
        return (int) Math.log10(n) + 1;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            // if(String.valueOf(nums[i]).length() % 2 == 0) {
            //     count++;
            // }
            if(getIntLengthLog(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;   
    }
}