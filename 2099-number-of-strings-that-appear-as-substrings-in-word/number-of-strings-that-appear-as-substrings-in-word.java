class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String curr : patterns) {
            if(word.contains(curr)) {
                count++;
            }
        }
        return count;
    }
}