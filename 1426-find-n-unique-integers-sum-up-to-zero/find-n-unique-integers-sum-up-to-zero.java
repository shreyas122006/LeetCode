class Solution {
    public int[] sumZero(int n) {
        int store[] = new int[n];
        int index = 0;
        boolean isEven = n%2 == 0;
        for(int i=-n/2; i<=n/2; i++) {
            if(isEven && i == 0) {
                continue;
            }
            store[index] = i;
            index++;
        }
        return store;
    }
}