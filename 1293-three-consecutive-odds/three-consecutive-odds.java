class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length < 3) {
            return false;
        }
        for(int i=2; i<arr.length; i++) {
            int first = arr[i];
            int second = arr[i-1];
            int third = arr[i-2];
            if((first % 2 == 1) && (second % 2 == 1) && (third % 2 == 1)) {
                return true;
            }
        }
        return false;
    }
}