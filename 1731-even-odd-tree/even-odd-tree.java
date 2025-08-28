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
    public boolean isEvenOddTree(TreeNode root) {
         if (root == null) {
            return true;
        }
        if(root.val%2==0) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = true;
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode temp1=queue.poll();
            for(int i = 0; i < size-1; i++){
                TreeNode temp2 = queue.poll();
                if(level %2 == 0){
                    if(temp1.val >= temp2.val || temp1.val%2==0) return false;
                }else{
                    if(temp1.val <= temp2.val || temp1.val%2==1) return false;
                }
                if(temp1.left != null) queue.add(temp1.left);
                if(temp1.right != null) queue.add(temp1.right);
                temp1 = temp2;
            }
            if(temp1.left != null) queue.add(temp1.left);
                if(temp1.right != null) queue.add(temp1.right);
                if(level%2==0 && temp1.val%2==0){
                    return false;
                }
                if(level%2==1 && temp1.val%2==1){
                    return false;
                }
            level++;
        }
        return true;
    }
}