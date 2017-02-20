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
    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        return invert(root);
    }
    
    private static TreeNode invert(TreeNode node) {
        if (node == null) {
            return node;
        } else {
            TreeNode leftTreeNode = invert (node.left);
            TreeNode rightTreeNode = invert (node.right);
            node.left = rightTreeNode;
            node.right = leftTreeNode;
        }
        return node;
    }
}
