class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a)); //Max freq first
        pq.addAll(map.keySet());
        StringBuilder store = new StringBuilder();
        while(!pq.isEmpty()) {
            char ch = pq.poll();
            for(int i = 0; i < map.get(ch); i++) { //append all char with that freq
                store.append(ch);
            }
        }
        return store.toString();
    }
}