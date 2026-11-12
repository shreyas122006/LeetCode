class Solution {
    public long pickGifts(int[] gifts, int k) {
        for(int i=0; i<k; i++) {
            long max = Long.MIN_VALUE;
            int idx = 0;
            for(int j=0; j<gifts.length; j++) {
                if(max <= gifts[j]) {
                    max = gifts[j];
                    idx = j;
                }
            }
            gifts[idx] = (int)Math.floor((int)Math.sqrt(max));
        }
        long sum = 0;
        for(int i=0; i<gifts.length; i++) {
            sum += gifts[i];
        }
        return sum;
    }
}