class Solution {
    public boolean canReach(int[] start, int[] target) {
        if((start[0] == target[0] && start[1] == target[1]) || ((start[0] + start[1]) % 2 == 0) && ((target[0] + target[1]) % 2) == 0 || ((start[0] + start[1]) % 2 == 1) && ((target[0] + target[1]) % 2) == 1) {
            return true;
        }
        return false;
    }
}