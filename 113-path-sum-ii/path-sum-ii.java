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
import java.util.*;

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        findPath(root, 0, new ArrayList<>(), targetSum);
        return result;
    }

    public void findPath(TreeNode root, int sum, List<Integer> temp, int targetSum) {
        if (root == null) return;

        sum += root.val;
        temp.add(root.val);

        // If leaf node
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                result.add(new ArrayList<>(temp));  // copy list
            }
            temp.remove(temp.size() - 1);  // backtrack here i.e. remove last (leaf node from temp arraylist)
            return;
        }

        findPath(root.left, sum, temp, targetSum);
        findPath(root.right, sum, temp, targetSum);

        temp.remove(temp.size() - 1); // backtrack here (both children of root are explored then backtrack to parent node after clearing arraylist)
    }
}