// class Solution {
//     public int minElement(int[] nums) {
//         for(int i=0; i<nums.length; i++) {
//             int curr = nums[i];
//             int sum = 0;
//             while(curr > 0) {
//                 sum += curr % 10;
//                 curr /= 10;
//             }
//             nums[i] = sum;
//         }
//         int min = 10001;
//         for(int i=0; i<nums.length; i++) {
//             if(min > nums[i]) {
//                 min = nums[i];
//             }
//         }
//         return min;
//     }
// }


class Solution {
    public int minElement(int[] nums) {
        int min = 10001;
        for(int i=0; i<nums.length; i++) {
            int curr = nums[i];
            int sum = 0;
            while(curr > 0) {
                sum += curr % 10;
                curr /= 10;
            }
            if(min > sum) {
                min = sum;
            }
        }
        return min;
    }
}