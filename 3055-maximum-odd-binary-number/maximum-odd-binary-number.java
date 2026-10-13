class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int count1 = 0;
        int count0 = 0;
        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            if(curr == '1') {
                count1++;
            } else {
                count0++;
            }
        }
        if(count1 == 1) {
            for(int i=0; i<s.length()-1; i++) {
                sb.append('0');
            }
            sb.append('1');
        } else {
            while(count1 > 1) {
                sb.append('1');
                count1--;
            }
            for(int i=0; i<count0; i++) {
                sb.append('0');
            }
            sb.append('1');
        }
        return sb.toString();
    }
}