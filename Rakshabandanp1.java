public class Project1 {
    public static void main(String[] args) {
        
        int n=10;
        int col=50;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<col;j++){
                
                if(i==0||j==0||i==n-1||j==col-1 ||i==2 || i==6){
                   
                    System.out.print("*");
                     
                }
                 else{
                    System.out.print(" ");
                }
                if (i==4 &&j==0) {
                    String mes="              Happy Raksha Bandhan    ";
                    System.out.print(mes);
                    j+=mes.length();
                }
                
                if(i==8 && j==22){
                    System.out.print("*");
                    j+=1;
                }
                if(i==1 && j==22){
                    System.out.print("*");
                    j+=1;
                }
                if(i==3&&j==22||j==10){
                    System.out.print("*");
                    j+=1;
                }
                if(j==40){
                    System.out.print("*");
                    j+=1;
                }
                
                
            }
            System.out.println();
        }
    }
}
