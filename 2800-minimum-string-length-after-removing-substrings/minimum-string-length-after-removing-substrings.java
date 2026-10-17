class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            if(sb.length() > 0 && sb.charAt(sb.length()-1) == 'A' && curr == 'B' || sb.length() > 0 && sb.charAt(sb.length()-1) == 'C' && curr == 'D') {
                sb.setLength(sb.length()-1);
            } else {
                sb.append(curr);
            } 
        }
        return sb.length(); 
    }
}