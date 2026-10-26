class Solution {
    public String firstPalindrome(String[] words) {
        for(String curr : words) {
            if(curr.length() == 1) {
                return curr;
            }
            boolean isPal = false;
            for(int i=0; i<curr.length()/2; i++) {
                if(curr.charAt(i) != curr.charAt(curr.length()-i-1)) {
                    isPal = false;
                    break;
                } else {
                    isPal = true;
                }
            }
            if(isPal) {
                return curr;
            }
        }
        return "";
    }
}