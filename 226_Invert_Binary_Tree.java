class Solution {
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
     
    private void swap(TreeNode node) {
        if (node == null) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        swap(node.left);
        swap(node.right);
    }
}