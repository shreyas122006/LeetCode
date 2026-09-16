class Solution {
    public String restoreString(String s, int[] indices) {
        char store[] = new char[indices.length];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<indices.length; i++) {
            store[indices[i]] = s.charAt(i);
        }
        for(int i=0; i<store.length; i++) {
            sb.append(store[i]);
        }
        return sb.toString();
    }
}