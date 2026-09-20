class Solution {
    public int reverseDegree(String s) {
        int Sum = 0;
        for(int i=0; i<s.length(); i++) {
            Sum += (26 - (s.charAt(i) - 'a')) * (i+1);
        }
        return Sum;
    }
}