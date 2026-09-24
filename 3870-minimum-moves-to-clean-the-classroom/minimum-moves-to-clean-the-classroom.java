class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        int[][] litter = new int[m][n];
        int startRow = 0, startCol = 0;
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                char ch = classroom[i].charAt(j);
                if(ch == 'S') {
                    startRow = i;
                    startCol = j;
                } 
                else if(ch == 'L') {
                    litter[i][j] = count++;
                }
            }
        }
        if(count == 0) {
            return 0;
        }
        int fullMask = (1 << count) - 1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{startRow, startCol, energy, fullMask});
        boolean[][][][] visited =
            new boolean[m][n][energy + 1][1 << count];
        visited[startRow][startCol][energy][fullMask] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int moves = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            while(size-- > 0) {
                int[] curr = q.poll();
                int row = curr[0];
                int col = curr[1];
                int currEnergy = curr[2];
                int mask = curr[3];
                if(mask == 0) {
                    return moves;
                }
                if(currEnergy == 0) {
                    continue;
                }
                for(int d = 0; d < 4; d++) {
                    int nr = row + dr[d];
                    int nc = col + dc[d];
                    if(nr < 0 || nr >= m || nc < 0 || nc >= n) {
                        continue;
                    }
                    if(classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }
                    int newEnergy = currEnergy - 1;
                    int newMask = mask;
                    if(classroom[nr].charAt(nc) == 'R') {
                        newEnergy = energy;
                    }
                    if(classroom[nr].charAt(nc) == 'L') {
                        newMask &= ~(1 << litter[nr][nc]);
                    }
                    if(!visited[nr][nc][newEnergy][newMask]) {
                        visited[nr][nc][newEnergy][newMask] = true;
                        q.offer(new int[]{nr, nc, newEnergy, newMask});
                    }
                }
            }
            moves++;
        }
        return -1;
    }
}