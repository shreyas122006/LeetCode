// class Solution {
//     public String stringHash(String s, int k) {
//         StringBuilder sb = new StringBuilder();
//         for(int i=0; i<s.length(); i+=k) {
//             int score = 0;
//             for(int j=i; j<i+k; j++) {
//                 score += s.charAt(j) - 'a';
//             }
//             int idx = score % 26;
//             char ch = (char)('a' + idx);
//             sb.append(ch);
//         }
//         return sb.toString();
//     }
// }

class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i+=k) {
            int score = 0;
            for(int j=i; j<i+k; j++) {
                score += s.charAt(j) - 'a';
            }
            sb.append((char)('a' + (score % 26)));
        }
        return sb.toString();
    }
}