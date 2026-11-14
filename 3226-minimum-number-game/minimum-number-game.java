class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> store = new PriorityQueue<>();
        for(int num : nums) {
            store.add(num);
        }
        int idx = 0;
        while(!store.isEmpty()) {
            int alice = store.poll();
            int bob = store.poll();
            nums[idx++] = bob;
            nums[idx++] = alice;
        }
        return nums;
    }
}