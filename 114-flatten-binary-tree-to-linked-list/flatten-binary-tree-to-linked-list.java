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
    public void flatten(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();

        helper(root, st);
        for(int i = 0; i<st.size()-1; i++){
            st.get(i).left = null;
            st.get(i).right = st.get(i+1);
        }
            
        return;

    }

    public void helper(TreeNode root, Stack<TreeNode> st){
        if(root == null ) return;

        st.push(root);
        helper(root.left,st);
        helper(root.right,st);

    }
}