class Solution {
    public int absDifference(int[] nums, int k) {
        PriorityQueue<Integer> big = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> small = new PriorityQueue<>();
        for(int num : nums) {
            big.offer(num);
            small.offer(num);
        }
        int diff = 0;
        for(int i=0; i<k; i++) {
            diff += big.poll();
            diff -= small.poll();
        }
        return Math.abs(diff);
    }
}