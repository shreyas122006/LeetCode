class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int tester[] = heights.clone();
        Arrays.sort(tester);
        for(int i=heights.length-1; i>=0; i--) {
            if(heights[i] != tester[i]) {
                count++;
            }
        }
        return count;
    }
}