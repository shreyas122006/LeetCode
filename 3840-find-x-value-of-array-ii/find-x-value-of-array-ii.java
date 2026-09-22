class Solution {
    class Node {
        int product;
        int[] count;
        Node(int k) {
            product = 1;
            count = new int[k];
        }
    }
    int k;
    Node merge(Node left, Node right) {
        Node curr = new Node(k);
        curr.product = (left.product * right.product) % k;
        for (int i = 0; i < k; i++) {
            curr.count[i] = left.count[i];
        }
        for (int i = 0; i < k; i++) {
            int rem = (left.product * i) % k;
            curr.count[rem] += right.count[i];
        }
        return curr;
    }
    Node[] tree;
    void build(int node, int start, int end, int[] nums) {
        if (start == end) {
            tree[node].product = nums[start] % k;
            tree[node].count[nums[start] % k] = 1;
            return;
        }
        int mid = (start + end) / 2;
        build(node * 2, start, mid, nums);
        build(node * 2 + 1, mid + 1, end, nums);
        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }
    void update(int node, int start, int end, int index, int value) {
        if (start == end) {
            tree[node] = new Node(k);
            value %= k;
            tree[node].product = value;
            tree[node].count[value] = 1;
            return;
        }
        int mid = (start + end) / 2;
        if (index <= mid) {
            update(node * 2, start, mid, index, value);
        } else {
            update(node * 2 + 1, mid + 1, end, index, value);
        }
        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }
    Node query(int node, int start, int end, int left, int right) {
        if (left <= start && end <= right) {
            return tree[node];
        }
        int mid = (start + end) / 2;
        if (right <= mid) {
            return query(node * 2, start, mid, left, right);
        }
        if (left > mid) {
            return query(node * 2 + 1, mid + 1, end, left, right);
        }
        Node a = query(node * 2, start, mid, left, right);
        Node b = query(node * 2 + 1, mid + 1, end, left, right);
        return merge(a, b);
    }
    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.k = k;
        int n = nums.length;
        tree = new Node[4 * n];
        for (int i = 0; i < tree.length; i++) {
            tree[i] = new Node(k);
        }
        build(1, 0, n - 1, nums);
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            int value = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];
            update(1, 0, n - 1, index, value);
            Node curr = query(1, 0, n - 1, start, n - 1);

            result[i] = curr.count[x];
        }
        return result;
    }
}