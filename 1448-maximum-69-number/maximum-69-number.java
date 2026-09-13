class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        int n = sb.length()-1;
        boolean oneTime = false;
        int number = 0;
        for(int i=0; i<sb.length(); i++) {
            if(sb.charAt(i) - '0' == 9) {
                number += 9 *Math.pow(10,n-i);
            } else if(oneTime == false){
                oneTime = true;
                number += 9 *Math.pow(10,n-i);
            } else {
                number += 6 *Math.pow(10,n-i);
            }
        }
        return number;
    }
}