class Solution {
    public String reversePrefix(String word, char ch) {
        
        int idx = word.indexOf(ch);
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=idx; i++) {
            sb.append(word.charAt(i));
        }
        sb.reverse();
        for(int j=idx+1; j<word.length(); j++) {
            sb.append(word.charAt(j));
        }
        return sb.toString();
    }
}