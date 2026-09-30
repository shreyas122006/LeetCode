class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(char curr : allowed.toCharArray()) {
            set.add(curr);
        }
        for(String s : words) {
            boolean valid = true;
            for(char x : s.toCharArray()) {
                if(!set.contains(x)) {
                    valid = false;
                    break;
                }
            }
            if(valid) {
                count++;
            }
        }
        return count;
    }
}