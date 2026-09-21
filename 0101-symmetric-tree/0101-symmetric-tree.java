class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        Queue<TreeNode> leftqueue = new LinkedList<>();
        Queue<TreeNode> rightqueue = new LinkedList<>();
        leftqueue.add(root.left);
        rightqueue.add(root.right);
        while(!leftqueue.isEmpty() && !rightqueue.isEmpty()){
            TreeNode leftnode = leftqueue.poll();
            TreeNode rightnode = rightqueue.poll();
            if(leftnode == null && rightnode == null){
                continue;
            }
            if(leftnode == null || rightnode == null){
                return false;
            }
            if(leftnode.val != rightnode.val){
                return false;
            }
            leftqueue.add(leftnode.left);
            leftqueue.add(leftnode.right);
            rightqueue.add(rightnode.right);
            rightqueue.add(rightnode.left);
        }
        return true;
    }
}