class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int n = matrix.length;
        // int m = matrix[0].length;
        // for (int i = 0; i < n; i++) {
        //     int left = 0;
        //     int right = m - 1;
        //     while (left <= right) {
        //         int mid = left + (right - left) / 2;
        //         if (matrix[i][mid] == target) {
        //             return true;
        //         } else if (matrix[i][mid] > target) {
        //             right = mid - 1;
        //         } else {
        //             left = mid + 1;
        //         }
        //     }
        // }
        // return false;

        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0) {  
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }
}