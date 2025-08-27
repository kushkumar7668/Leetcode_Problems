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
        dfs(root.left, root.right, depth+1);
        return root;
    }

    public void dfs(TreeNode node1, TreeNode node2, int depth){
        
        if(node1 == null || node2 == null)return;

          
    // you have to change the value only here
        if(depth%2 == 1){
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }
        
        // for this logic refer to codestorywithMIK at 16:30
        dfs(node1.left, node2.right, depth+1);
        dfs(node1.right, node2.left, depth+1);

            //              2                       level 0
            //          /        \
            //        3              5              level 1
            //     /     \         /    \
            //    8       13      21     34         level 2
            //  /  \     /  \    /  \    /  \
            // 1    2   3    4   5   6  7    8      level 3

    //  at level 3 swap left(8) ka left(1) with right(34) ka right(8) by recursion


        return ;
    }
}