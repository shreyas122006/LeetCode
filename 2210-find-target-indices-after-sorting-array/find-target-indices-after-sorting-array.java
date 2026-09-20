class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> store = new ArrayList<>();
        // int left = 0;
        // int right = nums.length-1;
        // while(left < right) {
        //     int mid = left + (right-left)/2;
        //     if(nums[mid] == target) {
        //         store.add(mid);
        //     } else if(nums[mid] > target) {
        //         right = mid - 1;
        //     } else if(nums[mid] < target) {
        //         left = mid + 1;
        //     }
        // }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                store.add(i);
            }
        }
        return store;
    }
}