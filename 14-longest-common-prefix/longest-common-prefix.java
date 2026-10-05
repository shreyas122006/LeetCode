class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        for(int i=0; i<str1.length(); i++) {
            if(str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
        // for(int i=0; i<strs[0].length(); i++) {
        //     if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)) {
        //         sb.append(strs[0].charAt(i));
        //     } else {
        //         break;
        //     }
        // }
        // return sb.toString();
    }
}