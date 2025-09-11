class Solution {
    public String sortVowels(String s) {
       ArrayList<Character>vowel=new ArrayList<>();
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='e'||c=='E'||c=='A'||c=='a'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
            vowel.add(c);
        }
       }
       Collections.sort(vowel); 
       StringBuilder sb=new StringBuilder();
       int index=0;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='e'||c=='E'||c=='A'||c=='a'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
            sb.append(vowel.get(index));
            index+=1;
        }
        else{
            sb.append(c);
        }
       }
       return sb.toString();
    }

}
