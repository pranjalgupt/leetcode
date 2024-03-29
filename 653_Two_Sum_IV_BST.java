class Solution {
    HashSet<Integer>a=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return solve(root,k);
    }
    public boolean solve(TreeNode root,int k){
        if(root==null){
            return false;
        }
        if(solve(root.left,k)) return true;
        if(a.contains(k-root.val)){
            return true;
        }
        a.add(root.val);
        return solve(root.right,k);
    }
}