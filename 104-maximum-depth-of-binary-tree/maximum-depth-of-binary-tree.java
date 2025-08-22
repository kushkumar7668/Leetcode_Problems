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
    public int maxDepth(TreeNode nn) {
        if(nn == null){
            return 0;  
            // if return 0 height of single node will be 1  
        }
        int left = maxDepth(nn.left);
        int right = maxDepth(nn.right);
        return Math.max(left,right) +1;
    }
}