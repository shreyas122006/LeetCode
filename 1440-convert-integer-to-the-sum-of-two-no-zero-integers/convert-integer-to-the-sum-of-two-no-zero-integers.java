class Solution {
    public int[] getNoZeroIntegers(int n) {
        if(n == 2) {
            return new int[] {1,1};
        }
            int i = 1;
            int j = n-1;
            String curr1 = Integer.toString(j);
            String curr2 = Integer.toString(i);
                while(true) {
                    curr1 = Integer.toString(j);
                    curr2 = Integer.toString(i);
                    if(curr1.indexOf('0') != -1 || curr2.indexOf('0') != -1) {
                        --j;
                        ++i;
                    } else {
                        break;
                    }
                }
        return new int[] {Integer.parseInt(curr1),Integer.parseInt(curr2)};
    }
}