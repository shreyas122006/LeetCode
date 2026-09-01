class Solution {
    static class Node {
        Node[] children = new Node[2];
        public Node() {
            for(int i=0; i<2; i++) {
            children[i] = null;
            }
        }
    }
    public static Node root;
    public static void insert(int num) {
        Node curr = root;
        for (int i = 30; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (curr.children[bit] == null) {
                curr.children[bit] = new Node();
            }
            curr = curr.children[bit];
        }
    }
    public static int getMaxXor(int num) {
        Node curr = root;
        int ans = 0;
        for (int i = 30; i >= 0; i--) {
            int bit = (num >> i) & 1;
            // Opposite bit gives XOR = 1
            int opposite = bit ^ 1;
            if (curr.children[opposite] != null) {
                ans |= (1 << i);
                curr = curr.children[opposite];
            } else {
                curr = curr.children[bit];
            }
        }
        return ans;
    }
    public int[] maximizeXor(int[] nums, int[][] queries) {
        Arrays.sort(nums);
        int q = queries.length;
        // Store original query indices
        Integer[] index = new Integer[q];
        for (int i = 0; i < q; i++) {
            index[i] = i;
        }
        // Sort queries according to m
        Arrays.sort(index, (a, b) -> 
            Integer.compare(queries[a][1], queries[b][1])
        );
        int[] ans = new int[q];
        Arrays.fill(ans, -1);
        root = new Node();
        int j = 0;
        for (int idx : index) {
            int x = queries[idx][0];
            int m = queries[idx][1];
            // Add all nums <= m
            while (j < nums.length && nums[j] <= m) {
                insert(nums[j]);
                j++;
            }
            // If at least one number is available
            if (j > 0) {
                ans[idx] = getMaxXor(x);
            }
        }
        return ans;
    }
}