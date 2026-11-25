// class Solution {
//     public int[] findThePrefixCommonArray(int[] A, int[] B) {
//         int store[] = new int[A.length];
//         HashSet<Integer> hs = new HashSet<>();
//         for(int i=0; i<A.length; i++) {
//             hs.add(A[i]);
//             int count = 0;
//             for(int j=0; j<=i; j++) {
//                 if(hs.contains(B[j])) {
//                     count++;
//                 }
//             }
//             store[i] = count;
//         }
//         return store;
//     }
// }

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] freq = new int[n + 1];
        int[] ans = new int[n];
        int common = 0;

        for (int i = 0; i < n; i++) {
            if (++freq[A[i]] == 2) common++;
            if (++freq[B[i]] == 2) common++;
            ans[i] = common;
        }
        return ans;
    }
}