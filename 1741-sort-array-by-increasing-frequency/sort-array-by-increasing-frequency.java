class Solution {
    public int[] frequencySort(int[] nums) {
        int store[] = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue <Integer> pq = new PriorityQueue<>(
            (a,b) -> { if(map.get(a)!=map.get(b)) {
                        return map.get(a) - map.get(b);
                        } 
                        return b-a;
                    });
        pq.addAll(map.keySet());
        int x=0; 
        while(!pq.isEmpty()) {
            int curr = pq.poll();
            for(int i=0; i<map.get(curr); i++) {
                store[x] = curr;
                x++;
            }
        }
        return store;
    }
}