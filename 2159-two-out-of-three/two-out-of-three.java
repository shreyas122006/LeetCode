// class Solution {
//     public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
//         ArrayList<Integer> store = new ArrayList<>();
//         HashSet<Integer> set = new HashSet<>();
//         HashSet<Integer> set1 = new HashSet<>();
//         HashSet<Integer> set2 = new HashSet<>();
//         HashSet<Integer> set3 = new HashSet<>();
//         for(int num1 : nums1) {
//             set1.add(num1);
//             set.add(num1);
//         }
//         for(int num2 : nums2) {
//             set2.add(num2);
//             set.add(num2);
//         }
//         for(int num3 : nums3) {
//             set3.add(num3);
//             set.add(num3);
//         }
//         for(int num : set) {
//             if(set1.contains(num) && set2.contains(num) || set1.contains(num) && set3.contains(num) || set2.contains(num) && set3.contains(num)) {
//                 store.add(num);
//             } 
//         }
//         return store;
//     }
// }
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean[] b1 = new boolean[101];
        boolean[] b2 = new boolean[101];
        boolean[] b3 = new boolean[101];
        for (int num : nums1) {
            b1[num] = true;
        }
        for (int num : nums2) {
            b2[num] = true;
        }
        for (int num : nums3) {
            b3[num] = true;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 100; ++i) {
            if ((b1[i] && b2[i]) || (b2[i] && b3[i]) || (b1[i] && b3[i])) {
                res.add(i);
            }
        }
        return res;
    }
}