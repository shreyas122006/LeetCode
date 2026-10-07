class Solution {
    Set<String> set = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int left = 0;
        int right = 0;
        // Find minimum number of '(' and ')' to remove
        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++;
            } 
            else if (c == ')') {
                if (left > 0) {
                    left--;
                } 
                else {
                    right++;
                }
            }
        }
        dfs(s, 0, left, right, 0, 0, "");
        return new ArrayList<>(set);
    }
    void dfs(String s, int index, int leftRemove, int rightRemove, int open, int close, String curr) {
        if (index == s.length()) {
            if (leftRemove == 0 && rightRemove == 0) {
                set.add(curr);
            }
            return;
        }
        char c = s.charAt(index);
        // Remove current '('
        if (c == '(' && leftRemove > 0) {
            dfs(s, index + 1, leftRemove - 1, rightRemove, open, close, curr);
        }
        // Remove current ')'
        if (c == ')' && rightRemove > 0) {
            dfs(s, index + 1, leftRemove, rightRemove - 1, open, close, curr);
        }
        // Keep current character
        if (c != '(' && c != ')') {
            dfs(s, index + 1, leftRemove, rightRemove, open, close, curr + c);
        }
        else if (c == '(') {
            dfs(s, index + 1, leftRemove, rightRemove, open + 1, close, curr + c);
        }
        else if (c == ')' && close < open) {
            dfs(s, index + 1, leftRemove, rightRemove, open, close + 1, curr + c);
        }
    }
}