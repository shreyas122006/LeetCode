class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char letter = 'a';
        for(char curr : key.toCharArray()) {
            if(!map.containsKey(curr) && curr != ' ') {
                map.put(curr,letter);
                letter++;
            }
        }
        for(char currM : message.toCharArray()) {
            sb.append(map.getOrDefault(currM,' '));
        }
        return sb.toString();
    }
}