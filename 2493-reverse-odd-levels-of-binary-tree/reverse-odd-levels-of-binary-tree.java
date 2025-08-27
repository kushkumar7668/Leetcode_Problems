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
    int depth = 0;
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) return null;
        invert(root.left, root.right, depth+1);
        return root;
    }

    public void invert(TreeNode leftNode, TreeNode rightNode, int depth){
        
        if(leftNode == null || rightNode == null)return;

    // you actually have to change the reference of left and right sub-tree not the value only.
        if((leftNode!=null || rightNode!=null) && depth%2 == 1){
            int temp = leftNode.val;
            leftNode.val = rightNode.val;
            rightNode.val = temp;
        }
        
        invert(leftNode.left, rightNode.right, depth+1);
        invert(leftNode.right, rightNode.left, depth+1);

        return ;
    }
}