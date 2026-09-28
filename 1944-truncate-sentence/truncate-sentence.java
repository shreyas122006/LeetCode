class Solution {
    public String truncateSentence(String s, int k) {
        String[] store = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++) {
            sb.append(store[i] + " ");
        }
        return sb.toString().trim();
    }
}