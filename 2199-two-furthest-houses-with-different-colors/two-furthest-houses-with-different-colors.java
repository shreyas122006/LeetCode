// class Solution {
//     public int maxDistance(int[] colors) {
//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<colors.length; i++) {
//             for(int j=i+1; j<colors.length; j++) {
//                 if(colors[i] != colors[j]) {
//                     max = Math.max(max, j-i);
//                 }
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int maxDistance(int[] colors) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = colors.length-1;
        while(left < right) {
            if(colors[left] != colors[right]) {
                max = Math.max(max, right - left);
            }
            right--;
        }
        right = colors.length-1;
        while(left < right) {
            if(colors[left] != colors[right]) {
                max = Math.max(max, right - left);
            }
            left++;
        }
        return max;
    }
}