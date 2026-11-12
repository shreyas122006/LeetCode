// class Solution {
//     public long pickGifts(int[] gifts, int k) {
//         for(int i=0; i<k; i++) {
//             long max = Long.MIN_VALUE;
//             int idx = 0;
//             for(int j=0; j<gifts.length; j++) {
//                 if(max <= gifts[j]) {
//                     max = gifts[j];
//                     idx = j;
//                 }
//             }
//             gifts[idx] = (int)Math.floor((int)Math.sqrt(max));
//         }
//         long sum = 0;
//         for(int i=0; i<gifts.length; i++) {
//             sum += gifts[i];
//         }
//         return sum;
//     }
// }

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for(int num : gifts) {
            pq.offer(num);
            sum += num;
        }
        for(int i = 0; i < k; i++) {
            int max = pq.poll();
            int remaining = (int)Math.sqrt(max);
            sum -= max - remaining;
            pq.offer(remaining);
        }
        return sum;
    }
}