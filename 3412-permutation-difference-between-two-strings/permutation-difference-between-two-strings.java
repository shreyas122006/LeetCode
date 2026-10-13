class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        int Occ1[] = new int[26];
        int Occ2[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            Occ1[s.charAt(i) - 'a'] = i;
            Occ2[t.charAt(i) - 'a'] = i;
        }
        for(int i=0; i<s.length(); i++) {
            sum += Math.abs((Occ1[s.charAt(i) - 'a']) - (Occ2[s.charAt(i) - 'a']));
        }  
        return sum; 
    }
}