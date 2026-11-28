// class Solution {
//     public String rearrangeString(String s, char x, char y) {
//         int xCount = 0;
//         int yCount = 0;
//         for(int i=0; i<s.length(); i++) {
//             if(s.charAt(i) == x) {
//                 xCount++;
//             } else if(s.charAt(i) == y) {
//                 yCount++;
//             }
//         }
//         StringBuilder sb = new StringBuilder();
//         for(int i=0; i<s.length(); i++) {
//             if(s.charAt(i) != x && s.charAt(i) != y) {
//                 sb.append(s.charAt(i));
//             }
//         }
//         for(int i=0; i<yCount; i++) {
//             sb.append(y);
//         }
//         for(int i=0; i<xCount; i++) {
//             sb.append(x);
//         }
//         return sb.toString();
//     }
// }

class Solution {
    public String rearrangeString(String s, char x, char y) {
        int xCount = 0;
        int yCount = 0;
        int n = s.length();
        int i = 0;
        for(i=0; i<n; i++) {
            char curr = s.charAt(i);
            if(curr == x) {
                xCount++;
            } else if(curr == y) {
                yCount++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(i=0; i<n; i++) {
            char curr = s.charAt(i);
            if(curr != x && curr != y) {
                sb.append(curr);
            }
        }
        for(i=0; i<yCount; i++) {
            sb.append(y);
        }
        for(i=0; i<xCount; i++) {
            sb.append(x);
        }
        return sb.toString();
    }
}