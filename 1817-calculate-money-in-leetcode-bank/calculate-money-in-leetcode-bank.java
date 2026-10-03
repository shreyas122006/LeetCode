class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int count = 1;
        int adder = 0;
        for(int i=0; i<n; i++) {
            if(count == 8) {
                ++adder;
                count = 1;
            }
            sum += count + adder;
            ++count;
        }
        return sum;
    }
}