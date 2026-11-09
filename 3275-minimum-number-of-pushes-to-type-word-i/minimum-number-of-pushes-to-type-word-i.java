class Solution {
    public int minimumPushes(String word) {
        if(word.length() <= 8) {
            return word.length();
        }
        if(word.length() <= 16) {
            return word.length() + (word.length() - 8);
        }
        if(word.length() <= 24) {
            return word.length() + word.length() - 8 + (word.length() - 16);
        }
        if(word.length() <= 26) {
            return word.length() + word.length() - 8 + word.length() - 16 + (word.length() - 24);
        }
        return -1;
    }
}