class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // HashSet<Integer> set = new HashSet<>();
        // int i=0;
        // int j=0;
        // while (i<nums1.length && j<nums2.length) {
        //     if(nums1[i] == nums2[j]) {
        //         set.add(nums1[i]);
        //         i++;
        //         j++;
        //     } else if(nums1[i] > nums2[j]) {
        //         j++;
        //     } else {
        //         i++;
        //     }
        // }
        // int store[] = new int[set.size()];
        // int idx = 0;
        // for(int x : set) {
        //     store[idx] = x;
        //     idx++;
        // }
        // return store;
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums1) {
            set.add(x);
        }
        HashSet<Integer> result = new HashSet<>();
        for(int y : nums2) {
            if(set.contains(y)) {
                result.add(y);
            }
        }
        int store[] = new int[result.size()];

        int idx = 0;
        for(int z : result) {
            store[idx] = z;
            idx++;
        }
        return store;
    }
}