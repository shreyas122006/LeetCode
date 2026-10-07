class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        String s1 = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '0') {
                s1 += '1';
            } else {
                s1 += '0';
            }
        }
        int num1 = Integer.parseInt(s1,2);
        return num1;
    }
}