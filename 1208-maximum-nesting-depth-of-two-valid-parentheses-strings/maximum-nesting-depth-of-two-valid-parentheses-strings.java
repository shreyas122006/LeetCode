class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] store = new int[seq.length()];
        int depth = 0;
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                depth++;
                store[i] = depth % 2;
            } else {
                store[i] = depth % 2;
                depth--;
            }
        }
        return store;
    }
}