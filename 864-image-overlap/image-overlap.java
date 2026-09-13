class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int max = 0;
        for(int row = -n + 1; row < n; row++) {
            for(int col = -n + 1; col < n; col++) {
                int count = 0;
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++) {
                        int shiftRow = i + row;
                        int shiftCol = j + col;
                        if(shiftRow >= 0 && shiftRow < n && shiftCol >= 0 && shiftCol < n) {
                            if(img1[i][j] == 1 && img2[shiftRow][shiftCol] == 1) {
                                count++;
                            }
                        }
                    }
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}