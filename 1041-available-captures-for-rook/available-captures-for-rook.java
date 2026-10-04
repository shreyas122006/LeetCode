class Solution {
    public int numRookCaptures(char[][] board) {
        int Ridx[] = new int[2];
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 'R') {
                    Ridx[0] = i;
                    Ridx[1] = j;
                    break;
                }
            }
        }
        int upCheck = Ridx[0]-1;
        int downCheck = Ridx[0]+1;
        int leftCheck = Ridx[1]-1;
        int rightCheck = Ridx[1]+1;
        int count = 0;
        while(upCheck >= 0) {
           if(board[upCheck][Ridx[1]] == 'p') {
                count++;
                break;
           } else if (board[upCheck][Ridx[1]] != '.') {
                break;
           }
           upCheck--;
        }
        while(downCheck <= board.length-1) {
           if(board[downCheck][Ridx[1]] == 'p') {
                count++;
                break;
           } else if (board[downCheck][Ridx[1]] != '.') {
                break;
           }
           downCheck++;
        }
        while(leftCheck >= 0) {
           if(board[Ridx[0]][leftCheck] == 'p') {
                count++;
                break;
           } else if (board[Ridx[0]][leftCheck] != '.') {
                break;
           }
           leftCheck--;
        }
        while(rightCheck <= board[0].length-1) {
           if(board[Ridx[0]][rightCheck] == 'p') {
                count++;
                break;
           } else if (board[Ridx[0]][rightCheck] != '.') {
                break;
           }
           rightCheck++;
        }
        return count;
    }
}