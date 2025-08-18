class Solution {
    public int[] intersection(int[] arr, int[] arr2) {
        ArrayList<Integer>A=new ArrayList<>();
              

        HashMap <Integer,Integer>h1=new HashMap<>();
        
        HashMap <Integer,Integer>h2=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(h1.containsKey(arr[i])){
                int value=h1.get(arr[i]);
                h1.put(arr[i],value+1);
            }else{
                h1.put(arr[i],1);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(h2.containsKey(arr2[i])){
                int value=h2.get(arr2[i]);
                h2.put(arr2[i],value+1);
            }else{
                h2.put(arr2[i],1);
            }
        }
        for(int a:h1.keySet()){
           if(h2.containsKey(a)){
            A.add(a);
           }
        } 
        int[] ans = new int[A.size()];
for (int i = 0; i < A.size(); i++) {
    ans[i] = A.get(i);
}
        return ans;
    }
}
