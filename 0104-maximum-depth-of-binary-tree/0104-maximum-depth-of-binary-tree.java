class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> elementqueue = new LinkedList<>();
        if(root == null) return 0;
        elementqueue.add(root);
        int numberoflevels = 0;
        while(true){
            int nodecount = elementqueue.size();
            if(nodecount == 0){
                return numberoflevels;
            }
            while(nodecount > 0){
                TreeNode element = elementqueue.poll();
                if(element.left != null){
                    elementqueue.add(element.left);
                }
                if(element.right != null){
                    elementqueue.add(element.right);
                }
                nodecount--;
            }
            numberoflevels++;
        }
    }
}