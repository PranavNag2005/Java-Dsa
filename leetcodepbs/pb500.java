class Solution {
    public String[] findWords(String[] words) {
        Set<Character>first=Set.of('q','w','e','r','t','y','u','i','o','p');
        Set<Character>second=Set.of('a','s','d','f','g','h','j','k','l');
        Set<Character>third=Set.of('z','x','c','v','b','n','m');
        List<String> ans=new ArrayList<>();
        for(String word:words){
            String lowercase=word.toLowerCase();
            Set<Character> row=null;
            char one=lowercase.charAt(0);
            if(first.contains(one)){
                row=first;
            }else if(second.contains(one)){row=second;}
            else if(third.contains(one)){
                row=third;
            }
            boolean isvalid=true;
            for(char c:lowercase.toCharArray()){
                if(!row.contains(c)){
                    isvalid=false;
                    break;
                }
            }
            if(isvalid){
                ans.add(word);
            }
        }
        String arr[]=new String[ans.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ans.get(i);
        }
        return arr;
        

    }
}
