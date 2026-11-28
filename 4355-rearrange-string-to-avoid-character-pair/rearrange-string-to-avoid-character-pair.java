class Solution {
    public String rearrangeString(String s, char x, char y) {
        int xCount = 0;
        int yCount = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == x) {
                xCount++;
            } else if(s.charAt(i) == y) {
                yCount++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != x && s.charAt(i) != y) {
                sb.append(s.charAt(i));
            }
        }
        for(int i=0; i<yCount; i++) {
            sb.append(y);
        }
        for(int i=0; i<xCount; i++) {
            sb.append(x);
        }
        return sb.toString();
    }
}