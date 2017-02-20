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
        if (root == null) {
            return root;
        } else {
            TreeNode leftTreeNode = invertTree (root.left);
            TreeNode rightTreeNode = invertTree (root.right);
            TreeNode temp = leftTreeNode;
            leftTreeNode = rightTreeNode;
            rightTreeNode = temp;
        }
        return root;
    }
}
