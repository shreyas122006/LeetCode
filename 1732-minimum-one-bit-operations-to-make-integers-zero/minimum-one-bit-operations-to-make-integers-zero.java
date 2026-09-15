class Solution {
    public int minimumOneBitOperations(int n) {
        int finalAns = 0;
        while(n > 0) {
            finalAns ^= n;
            n >>= 1;
        }
        return finalAns;
    }
}