/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
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
