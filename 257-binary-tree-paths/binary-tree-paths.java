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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<String> ll = new ArrayList<>();
        return print(root, "", ll );

    }

    public List<String> print (TreeNode root,String s, List<String> res){
        
        if(s.equals("")) s+=root.val;
        
        if(root.left == null && root.right == null){    // leaf node
            res.add(s);
            return res;
        }
        if(root.left!=null) {
            print(root.left, s+ "->" + root.left.val, res);
        }
        if(root.right!=null) {
            print(root.right,  s + "->" + root.right.val, res);
        }

        return res;
    }

}