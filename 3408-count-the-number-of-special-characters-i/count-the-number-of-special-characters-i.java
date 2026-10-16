class Solution {
    public int numberOfSpecialChars(String word) {
        // HashSet<Character> set = new HashSet<>();
        // for(int i=0; i<word.length(); i++) {
        //     if(word.contains(String.valueOf(Character.toUpperCase(word.charAt(i)))) && word.contains(String.valueOf(Character.toLowerCase(word.charAt(i))))) {
        //         set.add(word.charAt(i));
        //     }
        // }
        // return set.size()/2;
        boolean store[] = new boolean[26];
        for(int i=0; i<word.length(); i++) {
            char curr = word.charAt(i);
            if(word.contains(String.valueOf(Character.toUpperCase(curr))) && word.contains(String.valueOf(Character.toLowerCase(curr)))) {
                store[Character.toLowerCase(curr) - 'a'] = true;
            }
        }
        int count =0;
        for(int i=0; i<26; i++) {
            if(store[i]) {
                count++; 
            }
        }
        return count;

    }
}