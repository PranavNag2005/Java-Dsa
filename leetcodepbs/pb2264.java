class Solution {
    public String largestGoodInteger(String ans) {
        List<String>re=new ArrayList<>();
        for(int i=0;i<=ans.length()-3;i++){
            
            String sub=ans.substring(i, i+3);
            
            char c=sub.charAt(0);
            char c2=sub.charAt(1);
            char c3=sub.charAt(2);
            if(c==c2&&c2==c3){
                re.add(sub);
                
            }
        }
        String max = "";
        for (String s : re) {
            if (s.compareTo(max) > 0) {
                max = s;
            }
        }

        return re.isEmpty()?"":max;
    }
}
