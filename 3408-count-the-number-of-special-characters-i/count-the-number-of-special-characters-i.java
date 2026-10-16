class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<word.length(); i++) {
            if(word.contains(String.valueOf(Character.toUpperCase(word.charAt(i)))) && word.contains(String.valueOf(Character.toLowerCase(word.charAt(i))))) {
                set.add(word.charAt(i));
            }
        }
        return set.size()/2;
    }
}