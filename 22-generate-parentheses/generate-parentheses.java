class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> store = new ArrayList<>();
        solve(store, "", 0, 0, n);
        return store;
    }
    void solve(List<String> store, String str, int open, int close, int n) {
        if (str.length() == 2 * n) {
            store.add(str);
            return;
        }
        if (open < n) {
            solve(store, str + "(", open + 1, close, n);
        }
        if (close < open) {
            solve(store, str + ")", open, close + 1, n);
        }
    }
}