// class Solution {
//     public boolean validDigit(int n, int x) {
//         String s = String.valueOf(n);
//         boolean hasOne = false;
//         if(s.charAt(0) - '0' == x) {
//             return false;
//         }
//         for(int i=1; i<s.length(); i++) {
//             if(s.charAt(i) - '0' == x) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }


class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        if(s.charAt(0) - '0' != x && s.contains(String.valueOf(x))) {
            return true;
        }
        return false;
    }
}