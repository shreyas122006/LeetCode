class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(String key : map.keySet()) {
            if(map.get(key) == 1) {
                k--;
                if(k==0) {
                    return key;
                }
            }
        }
        return "";
    }
}