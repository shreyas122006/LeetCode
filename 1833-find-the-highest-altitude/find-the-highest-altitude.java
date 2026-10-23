class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int suffix[] = new int[n+1];
        suffix[0] = 0;
        int max = 0;    
        for(int i=1; i<n+1; i++) {
            suffix[i] = suffix[i-1] + gain[i-1];
            // max = Math.max(max,suffix[i]);
        }
        for(int i=0; i<n+1; i++) {
            max = Math.max(max,suffix[i]);
        }
        return max;
    }
}