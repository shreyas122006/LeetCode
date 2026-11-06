class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // ArrayList<Integer> store = new ArrayList<>();
        // for(int i=0; i<nums.length; i++) {
        //     store.add(index[i],nums[i]);
        // }
        // int[] ans = store.stream().mapToInt(Integer::intValue).toArray();
        // return ans;
        ArrayList<Integer> store = new ArrayList<>();
        int n = nums.length;
        int i=0;
        for(i=0; i<n; i++) {
            store.add(index[i],nums[i]);
        }
        int ans[] = new int[store.size()];
        for(i=0; i<n; i++) {
            ans[i] = store.get(i);
        }
        return ans;
    }
}