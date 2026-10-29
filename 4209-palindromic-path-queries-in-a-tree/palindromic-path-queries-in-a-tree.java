class Solution {
    private List<Integer>[] adj;
    private int[] parent, depth, size, heavy;
    private int[] head, pos, base;
    private int timer;
    private int[] seg;
    private int mask(char c) {
        return 1 << (c - 'a');
    }
    private void dfs(int u, int p) {
        parent[u] = p;
        size[u] = 1;
        int maxSize = 0;
        for (int v : adj[u]) {
            if (v == p) continue;
            depth[v] = depth[u] + 1;
            dfs(v, u);
            size[u] += size[v];
            if (size[v] > maxSize) {
                maxSize = size[v];
                heavy[u] = v;
            }
        }
    }
    private void decompose(int u, int h, String s) {
        head[u] = h;
        pos[u] = timer;
        base[timer++] = mask(s.charAt(u));
        if (heavy[u] != -1) {
            decompose(heavy[u], h, s);
        }
        for (int v : adj[u]) {
            if (v == parent[u] || v == heavy[u]) continue;
            decompose(v, v, s);
        }
    }
    private void build(int node, int l, int r) {
        if (l == r) {
            seg[node] = base[l];
            return;
        }
        int mid = (l + r) / 2;
        build(node * 2, l, mid);
        build(node * 2 + 1, mid + 1, r);
        seg[node] = seg[node * 2] ^ seg[node * 2 + 1];
    }
    private void update(int node, int l, int r, int idx, int val) {
        if (l == r) {
            seg[node] = val;
            return;
        }
        int mid = (l + r) / 2;
        if (idx <= mid) {
            update(node * 2, l, mid, idx, val);
        } else {
            update(node * 2 + 1, mid + 1, r, idx, val);
        }
        seg[node] = seg[node * 2] ^ seg[node * 2 + 1];
    }
    private int query(int node, int l, int r, int ql, int qr) {
        if (ql <= l && r <= qr) return seg[node];
        int mid = (l + r) / 2;
        int ans = 0;
        if (ql <= mid) {
            ans ^= query(node * 2, l, mid, ql, qr);
        }
        if (qr > mid) {
            ans ^= query(node * 2 + 1, mid + 1, r, ql, qr);
        }
        return ans;
    }
    private int pathQuery(int u, int v, int n) {
        int ans = 0;
        while (head[u] != head[v]) {
            if (depth[head[u]] < depth[head[v]]) {
                int temp = u;
                u = v;
                v = temp;
            }
            ans ^= query(1, 0, n - 1, pos[head[u]], pos[u]);
            u = parent[head[u]];
        }
        if (depth[u] > depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }
        ans ^= query(1, 0, n - 1, pos[u], pos[v]);
        return ans;
    }
    public List<Boolean> palindromePath(
        int n, int[][] edges, String s, String[] queries
    ) {
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        parent = new int[n];
        depth = new int[n];
        size = new int[n];
        heavy = new int[n];
        head = new int[n];
        pos = new int[n];
        base = new int[n];
        Arrays.fill(heavy, -1);
        dfs(0, -1);
        decompose(0, 0, s);
        seg = new int[4 * n];
        build(1, 0, n - 1);
        char[] chars = s.toCharArray();
        List<Boolean> result = new ArrayList<>();
        for (String q : queries) {
            String[] parts = q.split(" ");
            if (parts[0].equals("update")) {
                int u = Integer.parseInt(parts[1]);
                char c = parts[2].charAt(0);
                chars[u] = c;
                update(1, 0, n - 1, pos[u], mask(c));
            } else {
                int u = Integer.parseInt(parts[1]);
                int v = Integer.parseInt(parts[2]);
                int m = pathQuery(u, v, n);
                result.add((m & (m - 1)) == 0);
            }
        }
        return result;
    }
}