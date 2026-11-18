class Solution {
    public long removeZeros(long n) {
        StringBuilder sb = new StringBuilder();
        long curr = n;
        while(curr > 0) {
            if(curr % 10 != 0) {
                sb.append(curr % 10);
            }
            curr /= 10;
        }
        return Long.parseLong(sb.reverse().toString());
    }
}