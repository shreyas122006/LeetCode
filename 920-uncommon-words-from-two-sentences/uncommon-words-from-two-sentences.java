// class Solution {
//     public String[] uncommonFromSentences(String s1, String s2) {
//         HashMap<String,Integer> map = new HashMap<>();
//         String[] store1 = s1.split("\\s+"); 
//         String[] store2 = s2.split("\\s+"); 
//         for(String curr : store1) {
//             map.put(curr,map.getOrDefault(curr,0)+1);
//         }
//         for(String curr : store2) {
//             map.put(curr,map.getOrDefault(curr,0)+1);
//         }
//         ArrayList<String> store = new ArrayList<>();
//         for(String key : map.keySet()) {
//             if(map.get(key) == 1) {
//                 store.add(key);
//             }
//         }
//         return store.toArray(new String[0]);
//     }
// }
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : (s1 + " " + s2).split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        ArrayList<String> store = new ArrayList<>();
        for(String word : map.keySet()) {
            if(map.get(word) == 1) {
                store.add(word);
            }
        }
        return store.toArray(new String[0]);
    }
}