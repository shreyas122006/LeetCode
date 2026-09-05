class Solution {
    List<List<Integer>> store = new ArrayList<>();
    private void BackTrack(int nums[],boolean visit[], ArrayList<Integer> curr) {
        if(curr.size() == nums.length) {
            store.add(new ArrayList<>(curr));
        }
        for(int i=0; i<nums.length; i++) {
            if(visit[i]) {
                continue;
            }
            if(i > 0 && nums[i] == nums[i-1] && !visit[i-1]) {
                continue;
            }
            visit[i] = true;
            curr.add(nums[i]);
            BackTrack(nums,visit,curr);
            curr.remove(curr.size()-1);
            visit[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean visit[] = new boolean[nums.length];
        BackTrack(nums,visit,new ArrayList<>());
        return store;
    }
}