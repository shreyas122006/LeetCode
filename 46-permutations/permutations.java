class Solution {
    List<List<Integer>> store = new ArrayList<>();
    private void BackTrack(int[] nums, int idx, ArrayList<Integer> curr) {
        if(curr.size() == nums.length) {
            store.add(new ArrayList<>(curr));
        }
        for(int i=0; i<nums.length; i++) {
            if(curr.contains(nums[i])) {
                continue;
            }
            curr.add(nums[i]);
            BackTrack(nums,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        BackTrack(nums,0,new ArrayList<>());
        return store;
    }
}