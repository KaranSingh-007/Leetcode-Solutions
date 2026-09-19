class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        preorderhelper(root, list);
        return list;
    }
    void preorderhelper(Node root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        for(int i = 0; i<root.children.size(); i++){
            preorderhelper(root.children.get(i), list);
        }
    }
}