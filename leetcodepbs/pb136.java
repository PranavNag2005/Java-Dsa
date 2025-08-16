class Solution {
    public int singleNumber(int[] arr) {
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                int value=m.get(arr[i]);
                m.put(arr[i],value+1);
            }else{
                m.put(arr[i],1);
            }
        }
        
        for(Map.Entry<Integer, Integer>entry:m.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }return 0;
    }
}
