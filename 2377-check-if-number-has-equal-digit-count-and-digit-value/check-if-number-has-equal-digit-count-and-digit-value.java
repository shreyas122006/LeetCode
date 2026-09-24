class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(char curr : num.toCharArray()) {
            map.put(curr - '0',map.getOrDefault(curr - '0',0)+1);
        }
        for(int i=0; i<num.length(); i++) {
            if(num.charAt(i) - '0' != map.getOrDefault(i,0)) {
                return false;
            }
        }
        return true;
    }
}