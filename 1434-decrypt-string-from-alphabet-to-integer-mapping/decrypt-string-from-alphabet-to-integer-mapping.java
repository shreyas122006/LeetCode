class Solution {
    public String freqAlphabets(String s) {
        HashMap<String, Character> map = new HashMap<>();
        char curr = 'a';
        for(int i = 1; i <= 9; i++) {
            map.put(String.valueOf(i), curr);
            curr++;
        }
        for(int i = 10; i <= 26; i++) {
            map.put(String.valueOf(i) + "#", curr);
            curr++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length();) {
            if(i + 2 < s.length() && s.charAt(i + 2) == '#') {
                sb.append(map.get(s.substring(i, i + 3)));
                i += 3;
            } 
            else {
                sb.append(map.get(String.valueOf(s.charAt(i))));
                i++;
            }
        }
        return sb.toString();
    }
}