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
    public int minDepth(TreeNode root) {
        int height = findDepth(root, 1);
        return height;
    }

    public int findDepth(TreeNode root, int depth){
        if(root==null) return 0;

        if(root.left == null && root.right== null){
            return depth;
        }

        int l = findDepth(root.left, depth+1);
        int r = findDepth(root.right, depth+1);
        if(root.left == null) return r;
        else if(root.right == null) return l;
        return Math.min(l,r);
    }
}