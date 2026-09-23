class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int largest = -1;
        for(int num : arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()) {
            if(key == map.get(key)) {
                largest = Math.max(largest,key);
            }
        }
        return largest;
    }
}