class Solution {
    public boolean isSameAfterReversals(int num) {
        // boolean NotZero = false;
        // int sample = 1;
        // while(num > 0) {
        //     if(!NotZero && sample != 0) {
        //         sample = num % 10;
        //         num /= 10;
        //     } else {

        //         return false;
        //     }
        // }
        // return true;
        int test = num;
        int curr = 0;
        boolean notZeroes = false;
        while(test > 0) {
            curr = test % 10;
            test /= 10;
            if(curr != 0) {
                notZeroes = true;
            }
        }
        return (num % 10 == 0) && (notZeroes) ? false : true;
    }
}