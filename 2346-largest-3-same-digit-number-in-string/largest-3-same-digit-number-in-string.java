class Solution {
    public String largestGoodInteger(String num) {
        char max = ' ';
        for(int i = 0; i < num.length() - 2; i++) {
            if(num.charAt(i) == num.charAt(i + 1) &&
               num.charAt(i) == num.charAt(i + 2)) {
                max = (char)Math.max(max, num.charAt(i));
            }
        }
        return max == ' ' ? "" : String.valueOf(max).repeat(3);
    }
}