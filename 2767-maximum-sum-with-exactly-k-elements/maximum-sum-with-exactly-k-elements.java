// class Solution {
//     public int maximizeSum(int[] nums, int k) {
//         int max = Integer.MIN_VALUE;
//         for(int num : nums) {
//             if(max < num) {
//                 max = num;
//             }
//         }
//         int sum = 0;
//         while(k>0) {
//             sum += max;
//             max++;
//             k--;
//         }
//         return sum;
//     }
// }

class Solution {
    public int maximizeSum(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums) {
            pq.offer(num);
        }
        int sum = 0;
        while(k > 0) {
            int curr = pq.poll();
            sum += curr;
            pq.offer(++curr);
            k--;
        }
        return sum;
    }
}