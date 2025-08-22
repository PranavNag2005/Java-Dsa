//Recursive approach

class Solution {
    List<Integer>a=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        helper(root);
        return a;
         
    }
    void helper(TreeNode root){
        if(root==null){
            return;
        }
        a.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}
