class Solution {
    public String[] createGrid(int m, int n) {
        String[] store= new String[m];
        if(m==1) {
            store[0] = "";
            for(int i=0; i<n; i++) {
                store[0] += '.';
            }
            return store;
        } else if (n==1) {
            for(int i=0; i<m; i++) {
                store[i] = "";
                store[i] += '.';
            }
            return store;
        }
        for(int i=0; i<m; i++) {
            store[i] = "";
            for(int j=0; j<n; j++) {
                if(i == 0 || j == n-1) {
                    store[i] += '.';
                } else {
                    store[i] += '#';
                }
            }
        }
        return store;
    }
}