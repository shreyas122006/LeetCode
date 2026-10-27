class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int store[] = new int[n];
        // int freq[] = new int[101];
        boolean isF[] = new boolean[101];
        for(int i=0; i<n; i++) {
            isF[friends[i]] = true;
        }
        int idx = 0;
        for(int j=0; j<order.length; j++) {
            if(isF[order[j]]) {
                store[idx] = order[j];
                idx++;
            }
        }
        return store;
    }
}