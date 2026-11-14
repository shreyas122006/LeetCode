class Solution {
    public String greatestLetter(String s) {
        int upper[] = new int[26];
        int lower[] = new int[26];
        char store[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i=0; i<s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                upper[s.charAt(i) - 'A']++;
            } else {
                lower[s.charAt(i) - 'a']++;
            }
        }
        for(int i=25; i>=0; i--) {
            if(upper[i] >= 1 && lower[i] >= 1) {
                return Character.toString(store[i]);
            }
        }
        return "";
    }
}