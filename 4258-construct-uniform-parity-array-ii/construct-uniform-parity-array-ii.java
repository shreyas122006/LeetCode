// class Solution {
//     public boolean uniformArray(int[] nums1) {
//         int n = nums1.length;
//         boolean hasOdd = false;
//         int minOdd = Integer.MAX_VALUE;
//         for (int x : nums1) {
//             if (x % 2 == 1) {
//                 hasOdd = true;
//                 minOdd = Math.min(minOdd, x);
//             }
//         }
//         // Case 1: all even already
//         if (!hasOdd) return true;
//         // Case 2: target all odd — every even must exceed minOdd
//         for (int x : nums1) {
//             if (x % 2 == 0 && x < minOdd) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        for(int num:nums1){
            min=Math.min(min,num);
        }
        //minimum is odd->always possible
        if(min%2==1){
            return true;
        }
        //minimum is even -> all elements must be even 
        for(int num:nums1){
            if(num%2==1){
                return false;
            }
        }
        return true;
    }
}