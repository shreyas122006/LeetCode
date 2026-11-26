// class Solution {
//     public int lastStoneWeight(int[] stones) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for(int st : stones) {
//             pq.offer(st);
//         }
//         while(pq.size() > 1) {
//             int y = pq.poll();
//             int x = pq.poll();
//             if(x < y) {
//                 pq.offer(y-x);
//             }
//         }
//         if(!pq.isEmpty()) {
//             return pq.poll();
//         } else {
//             return 0;
//         }
//     }
// }

class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int st : stones) {
            list.add(st);
        }
        while(list.size() > 1) {
            Collections.sort(list, Collections.reverseOrder());
            int y = list.remove(0);
            int x = list.remove(0);
            if(y != x) {
                list.add(y - x);
            }
        }
        return list.isEmpty() ? 0 : list.get(0);
    }
}