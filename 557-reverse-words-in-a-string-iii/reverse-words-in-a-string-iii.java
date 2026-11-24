class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<words.length; i++) {
            for(int j=words[i].length()-1; j>=0; j--) {
                sb.append(words[i].charAt(j));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}