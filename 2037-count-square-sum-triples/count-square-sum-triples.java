class Solution {
    public int countTriples(int n) {
        int count = 0;
        int i=0;
        int j=0;
        int k=0;
        for(i=0; i<=n; i++) {
            for(j=i+1; j<=n; j++) {
                for(k=j+1; k<=n; k++) {
                    if(i!=j && j!=k && (i*i + j*j == k*k)) {
                        count+=2;
                    }
                }
            }
        }
        return count;
    }
}