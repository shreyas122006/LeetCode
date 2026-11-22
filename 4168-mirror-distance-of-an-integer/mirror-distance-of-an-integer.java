class Solution {
    public int mirrorDistance(int n) {
        int curr = n;
        int newNum = 0;
        while(curr > 0) {
            int digit = curr % 10;
            newNum = newNum * 10 + digit;
            curr /= 10;
        }
        return Math.abs(newNum - n);
    }
}