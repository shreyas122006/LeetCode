class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        boolean alter = false;
        if(String.valueOf(n).length() % 2 == 1) {
            while(n>0) {
                if(!alter) {
                    sum += n%10;
                    alter = true;
                } else {
                    sum += -(n%10);
                    alter = false;
                }
                n /= 10;
            }
        }   else {
                while(n>0) {
                if(!alter) {
                    sum += -(n%10);
                    alter = true;
                } else {
                    sum += n%10;
                    alter = false;
                }
                n /= 10;
                }
        }
        return sum;
    }
}