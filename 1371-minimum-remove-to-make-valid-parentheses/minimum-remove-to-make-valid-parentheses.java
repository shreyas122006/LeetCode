class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        int open = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else if (ch == ')') {
                if (open == 0) {
                    continue;
                }
                open--;
            }
            result.append(ch);
        }
        StringBuilder store = new StringBuilder();
        for (int i = result.length() - 1; i >= 0; i--) {
            char ch = result.charAt(i);
            if (ch == '(' && open > 0) {
                open--;
            } else {
                store.append(ch);
            }
        }
        return store.reverse().toString();
    }
}