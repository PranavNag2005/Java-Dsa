class Recursion{
   private int count=0;
    public  void number(){
        
        
        if(count==3){
            return;
        }
        System.out.println(count);
        count+=1;
        number();
    }
    public static void main(String[] args){
       Recursion r=new Recursion();
       r.number();;
    }
}