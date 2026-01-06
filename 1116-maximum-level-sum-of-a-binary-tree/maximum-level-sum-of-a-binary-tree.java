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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        int currLevel = 1;
        int ans = 1;
        int maxSum = Integer.MIN_VALUE;

        while(!q.isEmpty()){
            int n = q.size();
            int levelSum = 0;

            for(int i = 1; i<=n; i++){
                TreeNode node = q.poll();
                levelSum += node.val;

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }

            if(levelSum > maxSum){
                maxSum = levelSum;
                ans = currLevel;
            }

            currLevel++;

        }
        return ans;
    }
}