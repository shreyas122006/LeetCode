class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String curr : details) {
            int age = Integer.parseInt(curr.substring(11,13));
            if(age > 60) {
                count++;
            }
        }
        return count;
    }
}