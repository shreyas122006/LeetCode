class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            // if(Character.isDigit(curr)) { 
                if(i%2 == 1) {
                char prev = sb.charAt(sb.length()-1);
                prev += curr - '0';
                sb.append(prev);
            } else {
                sb.append(curr);
            }
            
        }
        return sb.toString();
    }
}