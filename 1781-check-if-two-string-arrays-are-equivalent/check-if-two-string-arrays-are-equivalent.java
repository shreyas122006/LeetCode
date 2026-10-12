class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String curr : word1) {
            sb1.append(curr);
        }
        for(String curr : word2) {
            sb2.append(curr);
        }
        return sb1.toString().equals(sb2.toString());
    }
}