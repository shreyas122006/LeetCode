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
    static int sum = 0;
    public void adder(TreeNode root, int low, int high) {
        if(root == null) {
            return;
        }
        if(root.val >= low && root.val <= high) {
            adder(root.left,low,high);
            sum += root.val;
            adder(root.right,low,high);
        } else if(root.val < low) {
            adder(root.right,low,high);
        } else { // root.val > high
            adder(root.left,low,high);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        adder(root,low,high);
        return sum;
    }
}