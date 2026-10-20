class Solution {
    public int prefixCount(String[] words, String pref) {
        int len = pref.length();
        int count = 0;
        for(String curr : words) {
            if(curr.length() >= len && curr.substring(0,len).equals(pref)) {
                count++;
            }
        }
        return count;
    }
}