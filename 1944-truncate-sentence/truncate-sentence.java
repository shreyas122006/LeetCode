class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(k==0) {
                break;
            }
            char curr = s.charAt(i);
            if(curr == ' ') {
                k--;
            }
            sb.append(curr);
        }
        return sb.toString().trim();
    }
}