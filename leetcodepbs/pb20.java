class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        
    
        for(int i=0;i<s.length();i++){
            char input=s.charAt(i);
            if(input=='(' || input=='{'||input=='['){
                st.push(input);
            }
            else{
                
                if (st.isEmpty()) {
                    return false;
                }char top=st.pop();
                if(input=='}' && top!='{' || input==']' && top!='[' || input==')'&& top!='('){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
