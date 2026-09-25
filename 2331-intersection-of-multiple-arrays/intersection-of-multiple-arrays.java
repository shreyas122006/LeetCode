// class Solution {
//     public List<Integer> intersection(int[][] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         ArrayList<Integer> store = new ArrayList<>();
//         for(int i=0; i<nums.length; i++) {
//             for(int j=0; j<nums[i].length; j++) {
//                 map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
//             }
//         }
//         for(int key : map.keySet()) {
//             if(map.get(key) == nums.length) {
//                 store.add(key);
//             }
//         }
//         Collections.sort(store);
//         return store;
//     }
// }
class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] freq=new int[1001];
        for(int[] arr:nums) {
            for(int x:arr) {
                freq[x]++;
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=1000;i++) {
            if(freq[i]==nums.length) {
                res.add(i);
            }
        }
        return res;
    }
}