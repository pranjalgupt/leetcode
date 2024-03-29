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
 

    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
    
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            if (node.val != val) return false;
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return true;
    }
    }
