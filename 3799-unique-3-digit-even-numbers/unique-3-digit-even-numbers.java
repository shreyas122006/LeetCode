class Solution {
    public int totalNumbers(int[] digits) {
        int[] count = new int[10];
        for (int digit : digits) { //count freq
            count[digit]++;
        }
        int store = 0;
        for (int i = 1; i <= 9; i++) { //first digit can't be 0
            if (count[i] == 0) continue;
            count[i]--;
            for (int j = 0; j <= 9; j++) { //second digit can be anything
                if (count[j] == 0) continue;
                count[j]--;
                for (int k = 0; k <= 8; k += 2) { //last digit can be even only
                    if (count[k] > 0) {
                        store++;
                    }
                }
                count[j]++;
            }
            count[i]++;
        }
        return store;
    }
}