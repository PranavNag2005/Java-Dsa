class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double>list=new ArrayList<>();
        if(root==null){
            return list;
        }
        
        Queue<TreeNode>queue=new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            double sum=0;
            for(int i=1;i<=size;i++){
                TreeNode curr=queue.poll();
                sum+=curr.val;
           
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }}
           list.add(sum/size);
            
        }
        return list;
    }
}
