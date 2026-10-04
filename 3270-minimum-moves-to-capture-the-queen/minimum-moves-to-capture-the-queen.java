class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        // int Ridx[] = new int[2];
        // int Bidx[] = new int[2];
        // int Qidx[] = new int[2];
        // int min = 0;
        // Ridx[0] = a;
        // Ridx[1] = b;
        // Bidx[0] = c;
        // Bidx[1] = d;
        // Qidx[0] = e;
        // Qidx[1] = f;

        int upLeftCheckB1 = c-1;
        int upLeftCheckB2 = d-1;
        int upRightCheckB1 = c-1;
        int upRightCheckB2 = d+1;
        int downLeftCheckB1 = c+1;
        int downLeftCheckB2 = d-1;
        int downRightCheckB1 = c+1;
        int downRightCheckB2 = d+1;

        int upCheckR = a-1;
        int downCheckR = a+1;
        int leftCheckR = b-1;
        int rightCheckR = b+1;

        char[][] board = new char[9][9];
        for(int i=1; i<9; i++) {
            for(int j=1; j<9; j++) {
                if(i == a && j == b) {
                    board[i][j] = 'R';
                } else if(i == c && j == d) {
                    board[i][j] = 'B';
                } else if(i == e && j == f) {
                    board[i][j] = 'Q';
                } else {
                    board[i][j] = '.';
                }
            }
        }

        while(upCheckR >= 1) {
            if(board[upCheckR][b] == 'Q') {
                return 1;
            } else if(board[upCheckR][b] != '.') {
                break;
            }
            upCheckR--;
        }
        while(downCheckR <= 8) {
            if(board[downCheckR][b] == 'Q') {
                return 1;
            } else if(board[downCheckR][b] != '.') {
                break;
            }
            downCheckR++;
        }
        while(leftCheckR >= 1) {
            if(board[a][leftCheckR] == 'Q') {
                return 1;
            } else if(board[a][leftCheckR] != '.') {
                break;
            }
            leftCheckR--;
        }
        while(rightCheckR <= 8) {
            if(board[a][rightCheckR] == 'Q') {
                return 1;
            } else if(board[a][rightCheckR] != '.') {
                break;
            }
            rightCheckR++;
        }

        while(upLeftCheckB1 >= 1 && upLeftCheckB2 >= 1) {
            if(board[upLeftCheckB1][upLeftCheckB2] == 'Q') {
                return 1;
            } else if(board[upLeftCheckB1][upLeftCheckB2] != '.') {
                break;
            }
            upLeftCheckB1--;
            upLeftCheckB2--;
        }
        while(upRightCheckB1 >= 1 && upRightCheckB2 <= 8) {
            if(board[upRightCheckB1][upRightCheckB2] == 'Q') {
                return 1;
            } else if(board[upRightCheckB1][upRightCheckB2] != '.') {
                break;
            }
            upRightCheckB1--;
            upRightCheckB2++;
        }
        while(downLeftCheckB1 <= 8 && downLeftCheckB2 >= 1) {
            if(board[downLeftCheckB1][downLeftCheckB2] == 'Q') {
                return 1;
            } else if(board[downLeftCheckB1][downLeftCheckB2] != '.') {
                break;
            }
            downLeftCheckB1++;
            downLeftCheckB2--;
        }
        while(downRightCheckB1 <= 8 && downRightCheckB2 <= 8) {
            if(board[downRightCheckB1][downRightCheckB2] == 'Q') {
                return 1;
            } else if(board[downRightCheckB1][downRightCheckB2] != '.') {
                break;
            }
            downRightCheckB1++;
            downRightCheckB2++;
        }
        return 2;
    }
}