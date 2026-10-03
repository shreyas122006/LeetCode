class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=lowLimit; i<=highLimit; i++) {
            int sum = 0;
            int curr = i;
            while(curr>0) {
                sum += curr%10;
                curr /= 10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int NoOfBalls = 0;
        for(int key : map.keySet()) {
            NoOfBalls = Math.max(NoOfBalls,map.get(key));
        }
        return NoOfBalls;
    }
}