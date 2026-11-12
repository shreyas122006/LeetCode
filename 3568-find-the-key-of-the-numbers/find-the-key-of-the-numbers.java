class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int minLength = Math.min(String.valueOf(num1).length(), Math.min(String.valueOf(num2).length(),String.valueOf(num3).length()));
        if(minLength == 0) {
            return 0;
        } else if(minLength == 1) {
            return Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
        } else if(minLength == 2) {
            int last = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            int first = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            return first * 10 + last;
        } else if(minLength == 3) {
            int last = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            int second = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            int first = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            return first * 100 + second * 10 + last;
        } else if(minLength == 4) {
            int last = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            int third = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            int second = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            int first = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            return first * 1000 + second * 100 + third * 10 + last;
        }  
        return -1;
    }
}