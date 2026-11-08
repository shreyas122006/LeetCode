class Solution {
    public int findClosest(int x, int y, int z) {
        // if(Math.abs(z-x) == Math.abs(z-y)) {
        //     return 0;
        // }
        // return (Math.abs(z-x) < Math.abs(z-y)) ? 1 : 2;
        if(z-x == z-y || x-z == z-y || z-x == y-z || x-z == y-z) {
            return 0;
        } else if(Math.abs(z-x) < Math.abs(z-y)) {
            return 1;
        }
        return 2;
    }
}