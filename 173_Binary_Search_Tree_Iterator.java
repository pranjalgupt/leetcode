class BSTIterator {
    Stack<TreeNode>st=new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode temp=st.pop();
        pushAll(temp.right);
        return temp.val;
    }
    
    public boolean hasNext() {
        if(!st.isEmpty()) return true;
        return false;
    }

    public void pushAll(TreeNode root){
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }
}
