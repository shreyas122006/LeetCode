// class Solution {
//     public int countCompleteDayPairs(int[] hours) {
//         int count = 0;
//         for(int i=0; i<hours.length; i++) {
//             for(int j=i+1; j<hours.length; j++) {
//                 if((hours[i] + hours[j]) % 24 == 0) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int count = 0;
        int h = hours.length;
        int i=0;
        int j=0;
        for(i=0; i<h; i++) {
            for(j=i+1; j<h; j++) {
                if((hours[i] + hours[j]) % 24 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}