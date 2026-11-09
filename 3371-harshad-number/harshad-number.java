class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int curr = x;
        int sum = 0;
        while(curr > 0) {
            sum += curr % 10;
            curr /= 10;
        }
        return (x % sum == 0) ? sum : -1; 
    }
}