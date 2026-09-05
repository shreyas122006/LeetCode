class Solution {
    List<List<Integer>> store = new ArrayList<>();
    private void BackTracker(int nums[], int idx, ArrayList<Integer> curr) {
        store.add(new ArrayList<>(curr));
        for(int i= idx; i<nums.length; i++) {
            curr.add(nums[i]);
            BackTracker(nums,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        BackTracker(nums,0,new ArrayList<>());
        return store;
    }
}