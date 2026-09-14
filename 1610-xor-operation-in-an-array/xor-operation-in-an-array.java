class Solution {
    public int xorOperation(int n, int start) {
        int totalVal = 0;
        for(int i=0; i<n; i++) {
            totalVal ^= start;
            start += 2;
        }  
        return totalVal; 
    }
}