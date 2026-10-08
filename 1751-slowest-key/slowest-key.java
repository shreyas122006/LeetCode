class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char slowest = keysPressed.charAt(0);
        int maxTime = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            if (duration > maxTime || (duration == maxTime && keysPressed.charAt(i) > slowest)) {       
                maxTime = duration;
                slowest = keysPressed.charAt(i);
            }
        }
        return slowest;
    }
}