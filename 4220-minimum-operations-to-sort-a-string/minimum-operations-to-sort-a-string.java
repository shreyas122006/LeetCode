class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char minChar = 'z';
        char maxChar = 'a';
        boolean sorted = true;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            minChar = (char) Math.min(minChar, ch);
            maxChar = (char) Math.max(maxChar, ch);
            if (i > 0 && s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
            }
        }
        if (sorted) return 0;
        if (n == 2) return -1;
        if (s.charAt(0) == minChar ||
            s.charAt(n - 1) == maxChar) {
            return 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == minChar ||
                s.charAt(i) == maxChar) {
                return 2;
            }
        }
        return 3;
    }
}
