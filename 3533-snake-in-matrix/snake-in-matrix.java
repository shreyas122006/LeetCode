class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int Pos = 0;
        for(String curr : commands) {
            if(curr.equals("DOWN")) {
                Pos += n;
            } else if(curr.equals("UP")) {
                Pos -= n;
            } else if(curr.equals("RIGHT")) {
                Pos += 1;
            } else {
                Pos -= 1;
            }
        }
        return Pos;
    }
}