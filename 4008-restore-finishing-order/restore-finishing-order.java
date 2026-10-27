class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int store[] = new int[n];
        int freq[] = new int[101];
        for(int i=0; i<n; i++) {
            freq[friends[i]]++;
        }
        int idx = 0;
        for(int j=0; j<order.length; j++) {
            if(freq[order[j]] == 1) {
                store[idx] = order[j];
                idx++;
            }
        }
        return store;
    }
}