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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p, q);
    }

    public boolean isSame (TreeNode node1, TreeNode node2){
        if(node1==null && node2==null) return true;
        if(node1==null || node2==null || node1.val!=node2.val) return false;

        boolean left = isSame(node1.left, node2.left);
        boolean right = isSame(node1.right, node2.right);

        return left && right;
    }
}