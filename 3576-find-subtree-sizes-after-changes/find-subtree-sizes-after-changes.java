class Solution {
    List<Integer>[] tree;
    List<Integer>[] store;
    int[] answer;
    char[] letters;
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        tree = new ArrayList[n];
        store = new ArrayList[26];
        answer = new int[n];
        letters = s.toCharArray();
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < 26; i++) {
            store[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            tree[parent[i]].add(i);
        }
        dfs(0, -1);
        return answer;
    }
    void dfs(int node, int par) {
        answer[node] = 1;
        int index = letters[node] - 'a';
        store[index].add(node);
        for (int child : tree[node]) {
            dfs(child, node);
        }
        int newParent = par;
        if (store[index].size() > 1) {
            newParent = store[index].get(store[index].size() - 2);
        }
        if (newParent != -1) {
            answer[newParent] += answer[node];
        }
        store[index].remove(store[index].size() - 1);
    }
}
