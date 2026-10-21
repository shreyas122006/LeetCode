class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int freq[] = new int[2001];
        // for(int i=0; i<arr.length; i++) {
        //     freq[arr[i]]++;
        // }
        // for(int i=1; i<=2001; i++) {
        //     if(k==0) {
        //         return i-1;
        //     }
        //      if(freq[i]==0) {
        //         --k;
        //     }
        // }
        // return -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        for(int i=1; i<=2001; i++) {
            if(k==0) {
                return i-1;
            }
            if(!set.contains(i)) {
                --k;
            }
        }
        return -1;
    }
}