class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int store[] = new int[A.length];
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<A.length; i++) {
            hs.add(A[i]);
            int count = 0;
            for(int j=0; j<=i; j++) {
                if(hs.contains(B[j])) {
                    count++;
                }
            }
            store[i] = count;
        }
        return store;
    }
}