class Solution {
    public boolean checkValid(int[][] matrix) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                int num = matrix[i][j];
                if(!set.contains(num)) {
                    set.add(num);
                } else {
                    return false;
                }
            }
            set.clear();
        }
        for(int i=0; i<matrix[0].length; i++) {
            for(int j=0; j<matrix.length; j++) {
                int num = matrix[j][i];
                if(!set.contains(num)) {
                    set.add(num);
                } else {
                    return false;
                }
            }
            set.clear();
        }
        return true;
    }
}