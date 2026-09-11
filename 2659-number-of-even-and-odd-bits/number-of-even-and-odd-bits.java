class Solution {
    public int[] evenOddBit(int n) {
        int store[] = new int[2];
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        int j=0;
        for(int i=sb.length()-1; i>=0; i--) {
            if(sb.charAt(i) == '1' && j%2 == 0) {
                store[0] = store[0] + 1;
            } else if(sb.charAt(i) == '1' && j%2 == 1) {
                store[1] = store[1] + 1;
            }
            j++;
        }
        return store;
    }
}