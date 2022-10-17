public class 102_Binary_tree_level_order_traversal {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int n=queue.size();
            for(int i=0;i<n;i++){
            TreeNode node=queue.poll();
                level.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            
            }
            ans.add(level);
        }
        return ans;
        
    }
}



