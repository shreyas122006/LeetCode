class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> store = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int freq[] = new int[101];
        for(int i=0; i<nums.length; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            freq[nums[i]]++;
        }
        for(int j=min; j<=max; j++) {
            if(freq[j] == 0) {
                store.add(j);
            }
        }
        return store;
    }
}