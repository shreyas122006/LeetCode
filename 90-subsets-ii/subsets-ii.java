class Solution {
    List<List<Integer>> store = new ArrayList<>();
    private void BackTrack(int nums[], int idx, ArrayList<Integer> curr) {
        store.add(new ArrayList<>(curr));
        for(int i=idx; i<nums.length; i++) {
            if( i > idx && nums[i] == nums[i-1]) {
                continue;
            }
            curr.add(nums[i]);
            BackTrack(nums,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        BackTrack(nums,0,new ArrayList<>());
        return store;
    }
}