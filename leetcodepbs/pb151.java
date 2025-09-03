class Solution {
    
    public String reverseWords(String s) {
        s=s.trim();
        List<String>w=new ArrayList<>();
        StringBuilder answer=new StringBuilder();
        StringBuilder word=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            else{
                if(word.length()>0){
                w.add(word.toString());}
                word.setLength(0);

            }
        }
        if(word.length()>0){
            w.add(word.toString());
        }
        for(int i=w.size()-1;i>=0;i--){
            answer.append(w.get(i));
            if(w.size()>0){
                answer.append(" ");
            }
        }

        

    return answer.toString().trim();
    }
}
