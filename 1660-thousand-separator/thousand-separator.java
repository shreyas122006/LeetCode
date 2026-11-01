class Solution {
    public String thousandSeparator(int n) {
        if(n < 1000) {
            return Integer.toString(n);
        }
        String curr = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i=curr.length()-1; i>=0; i--) {
            if(idx!=0 && idx % 3 == 0) {
                sb.append('.');
            }
            sb.append(curr.charAt(i));
            idx++;
        }
        return sb.reverse().toString();
    }
}