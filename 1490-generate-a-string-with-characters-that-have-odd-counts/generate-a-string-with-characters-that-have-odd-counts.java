class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        char first = 'x';
        char second = 'y';
        if(n%2 == 0) {
            sb.append(first);
            for(int i=0; i<n-1; i++) {
                sb.append(second);
            }
        } else {
            for(int i=0; i<n; i++) {
                sb.append(first);
            }
        }
        return sb.toString();
    }
}