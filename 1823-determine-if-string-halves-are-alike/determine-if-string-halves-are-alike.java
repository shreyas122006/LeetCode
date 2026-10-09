class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        if(n==2) {
            char temp1 = (char) (s.charAt(0) | 32);
            char temp2 = (char) (s.charAt(1) | 32);
            if((temp1 == 'a' || temp1 == 'e' || temp1 == 'i' || temp1 == 'o' || temp1 == 'u') && (temp2 == 'a' || temp2 == 'e' || temp2 == 'i' || temp2 == 'o' || temp2 == 'u')) {
                return true;
            } else {
                return false;
            }
        }
        String s1 = s.substring(0,n/2).toLowerCase();
        String s2 = s.substring(n/2).toLowerCase();
        int countV = 0;
        for(int i=0; i<n/2; i++) {
            char curr = s1.charAt(i);
            if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u') {
                countV++;
            }
        }
        for(int i=0; i<n/2; i++) {
            char curr = s2.charAt(i);
            if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u') {
                countV--;
            }
        }
        return countV == 0? true : false;
    }
}