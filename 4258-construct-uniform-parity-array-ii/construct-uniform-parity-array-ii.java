class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        boolean hasOdd = false;
        int minOdd = Integer.MAX_VALUE;
        for (int x : nums1) {
            if (x % 2 == 1) {
                hasOdd = true;
                minOdd = Math.min(minOdd, x);
            }
        }
        // Case 1: all even already
        if (!hasOdd) return true;
        // Case 2: target all odd — every even must exceed minOdd
        for (int x : nums1) {
            if (x % 2 == 0 && x < minOdd) {
                return false;
            }
        }
        return true;
    }
}