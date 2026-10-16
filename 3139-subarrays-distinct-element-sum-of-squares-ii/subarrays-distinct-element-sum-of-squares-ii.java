class Solution {
    static final long MOD = 1_000_000_007L;
    int n;
    long[] sum, squareSum, lazy;
    public int sumCounts(int[] nums) {
        n = nums.length;
        sum = new long[4 * n];
        squareSum = new long[4 * n];
        lazy = new long[4 * n];
        int[] lastSeen = new int[100001];
        java.util.Arrays.fill(lastSeen, -1);
        long answer = 0;
        for (int i = 0; i < n; i++) {
            int left = lastSeen[nums[i]] + 1;
            update(1, 0, n - 1, left, i);
            answer = (answer + squareSum[1]) % MOD;
            lastSeen[nums[i]] = i;
        }
        return (int) answer;
    }
    void apply(int node, int start, int end, long value) {
        long len = end - start + 1L;
        squareSum[node] = (squareSum[node] + 2 * value * sum[node] + value * value % MOD * len) % MOD;
        sum[node] = (sum[node] + value * len) % MOD;
        lazy[node] = (lazy[node] + value) % MOD;
    }
    void pushDown(int node, int start, int end) {
        if (lazy[node] == 0 || start == end) return;
        int mid = (start + end) / 2;
        apply(node * 2, start, mid, lazy[node]);
        apply(node * 2 + 1, mid + 1, end, lazy[node]);
        lazy[node] = 0;
    }

    void update(int node, int start, int end, int left, int right) {
        if (left > end || right < start) return;
        if (left <= start && end <= right) {
            apply(node, start, end, 1);
            return;
        }
        pushDown(node, start, end);
        int mid = (start + end) / 2;
        update(node * 2, start, mid, left, right);
        update(node * 2 + 1, mid + 1, end, left, right);
        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        squareSum[node] = (squareSum[node * 2] + squareSum[node * 2 + 1]) % MOD;
    }
}