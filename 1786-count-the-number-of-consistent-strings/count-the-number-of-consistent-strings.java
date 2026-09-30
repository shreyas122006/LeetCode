// class Solution {
//     public int countConsistentStrings(String allowed, String[] words) {
//         int count = 0;
//         HashSet<Character> set = new HashSet<>();
//         for(char curr : allowed.toCharArray()) {
//             set.add(curr);
//         }
//         for(String s : words) {
//             boolean valid = true;
//             for(char x : s.toCharArray()) {
//                 if(!set.contains(x)) {
//                     valid = false;
//                     break;
//                 }
//             }
//             if(valid) {
//                 count++;
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] present = new boolean[26];
        for(char ch : allowed.toCharArray()) {
            present[ch - 'a'] = true;
        }
        int count = 0;
        for(String word : words) {
            boolean valid = true;
            for(char ch : word.toCharArray()) {
                if(!present[ch - 'a']) {
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