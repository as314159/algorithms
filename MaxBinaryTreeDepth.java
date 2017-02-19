/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        }
        return findDepth(root, 0, 0);
    }
    
    private static int findDepth(TreeNode node, int depth, int maxDepth) {
        if (node == null) {
            return depth;
        } else {
            ++depth;
        }
        int leftDepth = findDepth(node.left, depth, maxDepth);
        int rightDepth = findDepth(node.right, depth, maxDepth);
        if (leftDepth > rightDepth) {
            return leftDepth;
        } else {
            return rightDepth;
        }
    }
}
