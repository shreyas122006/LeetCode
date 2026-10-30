class Solution {
    public int maxDifference(String s) {
        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int maxO = Integer.MIN_VALUE;
        int minE = Integer.MAX_VALUE;
        for(int i=0; i<=25; i++) {
            if(freq[i] == 0) {
                continue;
            }
            if(freq[i] % 2 == 0) {
                minE = Math.min(minE,freq[i]);
            } else if(freq[i] % 2 == 1){
                maxO = Math.max(maxO,freq[i]);
            }
        }
        return (maxO - minE);
    }
}