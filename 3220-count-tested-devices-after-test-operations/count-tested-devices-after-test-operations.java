class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        // int count = 0;
        // for(int i=0; i<batteryPercentages.length; i++) {
        //     if(batteryPercentages[i]>0) {
        //         count++;
        //         for(int j=i+1; j<batteryPercentages.length; j++) {
        //             if(batteryPercentages[j] != 0) {
        //                 batteryPercentages[j]--;
        //             }
        //         }
        //     }
        // }
        // return count;
        int n = batteryPercentages.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (batteryPercentages[i] - count > 0) { //increase count if > 0
                count++;
            }
        }
        return count;
    }
}