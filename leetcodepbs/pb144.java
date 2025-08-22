class Solution {
    List<Integer>a=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return a;
        }
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr=st.pop();
            a.add(curr.val);
            if(curr.right!=null){
                st.push(curr.right);
            }
            if(curr.left!=null){
                st.push(curr.left);
            }
        }
        return a;
         
    }
    
}
