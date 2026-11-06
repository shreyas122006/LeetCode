class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> store = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            store.add(index[i],nums[i]);
        }
        int[] ans = store.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}