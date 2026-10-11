class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        for(String curr : words1) {
            map1.put(curr,map1.getOrDefault(curr,0)+1);
        }
        for(String curr : words2) {
            map2.put(curr,map2.getOrDefault(curr,0)+1);
        }
        for(String key : map1.keySet()) {
            if(map1.getOrDefault(key,0) == 1 && map2.getOrDefault(key,0) == 1) {
                count++;
            }
        }
        return count;
    }
}