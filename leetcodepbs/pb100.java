class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
      
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        queue.add(p);
        q2.add(q);
       while(!queue.isEmpty() && !q2.isEmpty()){
        TreeNode tree1=queue.poll();
        TreeNode tree2=q2.poll();
        if(tree1.val!=tree2.val){
            return false;
        }
        if(tree1.left!=null && tree2.left!=null){
            queue.add(tree1.left);
            q2.add(tree2.left);
        }
        else if(tree1.left!=null || tree2.left!=null){
            return false;
        }
        if(tree1.right!=null && tree2.right!=null){
            queue.add(tree1.right);
            q2.add(tree2.right);
        }
        else if(tree1.right!=null || tree2.right!=null){
            return false;
        }
       }
       return queue.isEmpty()&&q2.isEmpty();
    }
}
