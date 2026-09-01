class Solution {
    static class Node  {
        Node children[] = new Node[2];
        public Node() {
            for(int i=0; i<2; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root;
    public static void insert(int num) {
        Node curr = root;
        for(int i=30; i>=0; i--) {
            int bit = (num>>i) & 1;
            if(curr.children[bit] == null) {
                curr.children[bit] = new Node();
            }
            curr = curr.children[bit];
        }
    }
    public int getMaxXor(int num) {
        Node curr = root;
        int ans = 0;
        for (int i = 30; i >= 0; i--) {
            int bit = (num >> i) & 1;
            // We take opposite bit to maximize XOR
            int opposite = bit ^ 1;
            if (curr.children[opposite] != null) {
                // That bit becomes 1
                ans = ans | (1 << i);
                curr = curr.children[opposite];
            } else {
                curr = curr.children[bit];
            }
        }
        return ans;
    }
    public int findMaximumXOR(int[] nums) {
        root = new Node();
        for(int num : nums) { // insert all into trie
            insert(num);
        }
        int ans = 0;
        for(int num : nums) { //get best of them
            ans = Math.max(ans,getMaxXor(num));
        }
        return ans;
    }
}