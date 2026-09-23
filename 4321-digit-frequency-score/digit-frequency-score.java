class Solution {
    public int digitFrequencyScore(int n) {
        int score = 0;
        int digit = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n>0) {
            digit = n%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            n /= 10;
        }
        for(int key : map.keySet()) {
            score += key * map.get(key);
        }
        return score;
    }
}