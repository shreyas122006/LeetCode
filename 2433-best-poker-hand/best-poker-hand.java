class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        if (suits[0] == suits[1] &&
            suits[1] == suits[2] &&
            suits[2] == suits[3] &&
            suits[3] == suits[4]) {
            return "Flush";
        }
        int[] count = new int[14];
        for (int rank : ranks) {
            count[rank]++;
        }
        boolean pair = false;
        for (int c : count) {
            if (c >= 3) {
                return "Three of a Kind";
            }
            if (c == 2) {
                pair = true;
            }
        }
        return pair ? "Pair" : "High Card";
    }
}