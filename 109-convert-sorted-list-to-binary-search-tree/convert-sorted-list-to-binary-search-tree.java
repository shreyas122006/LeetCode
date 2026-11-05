/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBST(ArrayList<Integer> store, int st, int end) {
        if(st>end) {
            return null;
        }
        int mid = (st+end)/2;
        TreeNode root = new TreeNode(store.get(mid));
        root.left = createBST(store,st,mid-1);
        root.right = createBST(store,mid+1,end);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> store = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null) {
            store.add(temp.val);
            temp = temp.next;
        }
        return createBST(store,0,store.size()-1);
    }
}