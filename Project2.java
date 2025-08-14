public class Project2 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==1&&j==4){
                    System.out.print("@");
                    j+=1;
                }
                if(i==0||i==1||i==2||j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        System.out.println("HAPPY INDEPENDENCE DAY");
    }
}
