class Solution {
    public String reformatDate(String date) {
        String store[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        StringBuilder sb = new StringBuilder();
        if(date.length() == 13) {
            sb.append(date.substring(9));
            sb.append('-');
            int idx = 0;
            while(!date.substring(5,8).equals(store[idx])) {
                idx++;
            }
            if(idx+1 < 10) {
                sb.append('0');
                sb.append(idx+1);
            } else {
                sb.append(idx+1);
            }
            sb.append('-');
            sb.append(date.substring(0,2));
        } else {
            sb.append(date.substring(8));
            sb.append('-');
            int idx = 0;
            while(!date.substring(4,7).equals(store[idx])) {
                idx++;
            }
            if(idx+1 < 10) {
                sb.append('0');
                sb.append(idx+1);
            } else {
                sb.append(idx+1);
            }
            sb.append('-');
            sb.append('0');
            sb.append(date.substring(0,1));
        }
        return sb.toString();
    }
}