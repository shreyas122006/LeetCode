class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // char val = '{';
        // for(int i=0; i<letters.length; i++) {
        //     if(target < letters[i] && letters[i] < val) {
        //         val = letters[i];
        //     }
        // }
        // return val == '{' ? letters[0] : val;
        int left = 0;
        int right = letters.length-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(letters[mid] <= target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return letters[left % letters.length];
    }
}