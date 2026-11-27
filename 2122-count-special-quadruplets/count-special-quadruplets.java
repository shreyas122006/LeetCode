// class Solution {
//     public int countQuadruplets(int[] nums) {
//         int first = nums[0];
//         int second = nums[1];
//         int third = nums[2];
//         int fourth = nums[3];
//         int count = 0;
//         for(int i=0; i<nums.length; i++) {
//             for(int j=i+1; j<nums.length; j++) {
//                 for(int k=j+1; k<nums.length; k++) {
//                     for(int l=k+1; l<nums.length; l++) {
//                         if(nums[i] + nums[j] + nums[k] == nums[l]) {
//                             count++;
//                         }
//                     }
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        int n = nums.length;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for(a=0; a<n; a++) {
            for(b=a+1; b<n; b++) {
                for(c=b+1; c<n; c++) {
                    for(d=c+1; d<n; d++) {
                        if(nums[a] + nums[b] + nums[c] == nums[d]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}