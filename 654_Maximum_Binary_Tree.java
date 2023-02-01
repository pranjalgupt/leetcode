class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        for (int i = 0; i < nums.length;i++) {
            TreeNode cur = new TreeNode(nums[i]);
            while (!stack.isEmpty() && nums[i] > stack.peek().val) {
                cur.left = stack.pop();
            }
            if (!stack.isEmpty()) {
                stack.peek().right = cur;
            }
            stack.push(cur);
        }
        return stack.isEmpty()? null : stack.removeLast();
    }
}