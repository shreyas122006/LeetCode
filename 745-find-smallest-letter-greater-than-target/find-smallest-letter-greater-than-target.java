class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char val = '{';
        for(int i=0; i<letters.length; i++) {
            if(target < letters[i] && letters[i] < val) {
                val = letters[i];
            }
        }
        return val == '{' ? letters[0] : val;
    }
}