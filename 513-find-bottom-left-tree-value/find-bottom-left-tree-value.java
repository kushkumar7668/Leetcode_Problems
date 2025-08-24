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


// BFS of a tree is often implemented such that the left child of a given node is visited first, then the right child. If we implement BFS such that the right child of a given node is visited first, then the left child, the last node we visit is the leftmost node in the bottom level of the tree. This makes a variable for depth unnecessary. We can just return the value of the last node we encounter during the search.

// Algorithm->

// Initialize a Queue queue for storing the nodes on each level.
// Create a new node current and set it to root.
// Add current to queue.
// While queue is not empty:
// Remove the front node from the queue and save it in current.
// If the current has a right child, add it to queue.
// If the current has a left child, add it to queue.
// After the while loop, each node in the tree has been visited. The search traversed the whole tree, top to bottom, right to left, so the last node stored in current is the leftmost node in the bottom level of the tree, and we return its value.

//-------------------------------------------------------------------------------//

// level order(bfs) optimised approach -> see editorial bfs approach 

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode current = root;
        queue.add(current);

        while (!queue.isEmpty()) {
            current = queue.poll();
            if (current.right != null) {
                queue.add(current.right);
            }
            if (current.left != null) {
                queue.add(current.left);
            }
        }
        return current.val;
    }
}




//_____________________________________________________________________________//

// level-order bruteforce approach (bfs) ->

// class Solution {
//     public int findBottomLeftValue(TreeNode root) {
//         List<List<Integer>> ll = levelOrder(root);
//         return ll.get(ll.size()-1).get(0);
//     }

//     public List<List<Integer>> levelOrder(TreeNode root) {
//         if (root == null) return new ArrayList<>();
        
//         List<List<Integer>> res = new ArrayList<>();
//         Queue<TreeNode> q = new LinkedList<>();     
//         q.add(root);

//         while (!q.isEmpty()) {
//             List<Integer> level = new ArrayList<>();
//             for (int i = q.size(); i > 0; i--) { // loop exactly size times
//                 TreeNode node = q.poll();
//                 level.add(node.val);
//                 if (node.left != null) q.add(node.left);
//                 if (node.right != null) q.add(node.right);
//             }
//             res.add(level);
//         }
//         return res;
//     }
// }
