class Solution {
    public int findCenter(int[][] edges) {
        int num1 = edges[0][0];
        int num2 = edges[0][1];
        int num3 = edges[1][0];
        int num4 = edges[1][1];
        if(num1 == num3 || num1 == num4) {
            return num1;
        }
        if(num2 == num3 || num2 == num4) {
            return num2;
        }
        return num1;
    }
}