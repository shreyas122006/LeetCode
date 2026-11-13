class Solution {
    public int calculateScore(int a, int b) {
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toBinaryString(b);
        int score1 = 0;
        int score2 = 0;
        for(char ch : s1.toCharArray()) {
            if(ch - '0' == 1) {
                score1++;
            }
        }
        for(char ch : s2.toCharArray()) {
            if(ch - '0' == 1) {
                score2++;
            }
        }
        return score1 >= score2 ? score1*score2 : score2/score1;
    }
}