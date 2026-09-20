class Solution {
    public int[] singleNumber(int[] nums) {
        // int store[] = new int[2];
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num : nums) {
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // int i=0;
        // for(int key : map.keySet()) {
        //     if(map.get(key) == 1) {
        //         store[i] = key;
        //         i++;
        //     }
        // }
        // return store;
        int xor = 0;
        for(int num : nums) {
            xor ^= num;
        }
        int bit = xor & -xor;
        int first = 0;
        int second = 0;
        for(int num : nums) {
            if((num & bit) != 0) {
                first ^= num;
            } else {
                second ^= num;
            }
        }
        return new int[]{first, second};
    }
}