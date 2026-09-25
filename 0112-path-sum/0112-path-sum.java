class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> sumstack = new Stack<>();
        stack.push(root);
        sumstack.push(root.val);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            int tempval = sumstack.pop();
            if(temp.left == null && temp.right == null && tempval == targetSum){
                return true;
            }
            if(temp.right != null){
                stack.push(temp.right);
                sumstack.push(temp.right.val + tempval);
            }
            if(temp.left != null){
                stack.push(temp.left);
                sumstack.push(temp.left.val + tempval);
            }
        }

        return false;
    }
}