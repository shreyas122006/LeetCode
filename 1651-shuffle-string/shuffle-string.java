class Solution {
    public String restoreString(String s, int[] indices) {
        char store[] = new char[indices.length];
        for(int i=0; i<indices.length; i++) {
            store[indices[i]] = s.charAt(i);
        }
        return new String(store);
    }
}