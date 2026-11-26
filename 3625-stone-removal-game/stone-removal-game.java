class Solution {
    public boolean canAliceWin(int n) {
        boolean alice = false;
        boolean bob = false;
        if(n<10) {
            return false;
        } else {
            int sub = 10;
            n = n-sub;
            sub--;
            alice = true;
            while(sub > 0) {
                if(sub > n) {
                    if(!bob) {
                        return true;
                    }
                    if(!alice) {
                        return false;
                    }
                } else {
                    n = n-sub;
                    if(alice) {
                        bob = true;
                        alice = false;
                    } else {
                        bob = false;
                        alice = true;
                    }
                    sub--;
                }
            }
        }
        return false;
    }
}