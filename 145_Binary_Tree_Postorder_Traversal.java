class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> preorder=new ArrayList<>();
        postOrder(root,preorder);
        return preorder;
    }
    void postOrder(TreeNode curr, ArrayList<Integer> postorder){
        if (curr==null){
            return;
        }
        postOrder(curr.left,postorder);
        postOrder(curr.right,postorder);
        postorder.add(curr.val);
    }
}