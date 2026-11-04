class Solution {
    public int findCenter(int[][] edges) {
        // int num1 = edges[0][0];
        // int num2 = edges[0][1];
        // int num3 = edges[1][0];
        // int num4 = edges[1][1];
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        }
        if(edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1]) {
            return edges[0][1];
        }
        return -1;
    }
}