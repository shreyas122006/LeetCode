class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> store = new ArrayList<>();
        for(int i=0; i<nums.length; i+=2) {
            if(i+1 < nums.length) {
                int freq = nums[i];
                int val = nums[i+1];
                for(int j=0; j<freq; j++) {
                    store.add(val);
                }
            } 
        }
        int[] intArr = store.stream().mapToInt(Integer::intValue).toArray();
        return intArr;
    }
}