class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int store[] = new int[n];
        // for(int i=0; i<boxes.length(); i++) {
        //     store[i] = boxes.charAt(i) - '0';
        // }
        for(int i=0; i<n; i++) {
            int minMoves = 0;
            for(int j=0; j<n; j++) {
                if(i!=j && boxes.charAt(j) == '1') {
                    minMoves += Math.abs(j-i);
                }
            }
            store[i] += minMoves;
        }
        return store;
    }
}