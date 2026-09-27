class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int store[] = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int num1: nums1) {
            set.add(num1);
        }
        int count = 0;
        for(int num2: nums2) {
            if(set.contains(num2)) {
                count++;
            }
        }
        store[1] = count;
        count = 0;
        set.clear();
        for(int num2: nums2) {
            set.add(num2);
        }
        for(int num1: nums1) {
            if(set.contains(num1)) {
                count++;
            }
        }
        store[0] = count;
        return store;
    }
}