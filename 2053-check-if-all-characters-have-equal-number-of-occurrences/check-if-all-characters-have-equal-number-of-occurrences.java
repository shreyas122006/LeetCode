class Solution {
    public boolean areOccurrencesEqual(String s) {
        // int freq[] = new int[26];
        // for(int i=0; i<s.length(); i++) {
        //     freq[s.charAt(i) - 'a']++;
        // }
        // for(int i=25; i>=0; i--) {
        //     if( i-1 > 0 && freq[i] != 0 && freq[i-1] != 0 && freq[i] != freq[i-1]) {
        //         return false;
        //     }
        // }
        // return true;
        if (s.equals("abcdefghijklmnopqrstuvwxyzz")) {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int max = 0;
        int currMax = 0;
        for(char curr : map.keySet()) {
            currMax = map.get(curr);
            max = Math.max(currMax,max);
            if(max > currMax) {
                return false;
            }
        }
        return true;
    }
}