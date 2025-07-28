package twentyeight;

 class Parent {
    int a,i;
    void setage(int a){
        a=a;
    }
    void setyear(int i){
        this.i=i;
    }
    int getage(){
        return a;
    }
    int getyear(){
        return i;
    }
}
class Child extends Parent{
    String name;
    void empname(String name){
        this.name=name;
    }
    String getempname(){
        return name;
    }

}
public class OOPs{
    public static void main(String[] args) {
        Child c=new Child();
        c.empname("pranav");
        System.out.println(c.getempname());
        c.setage(123);
        System.out.println(c.getage());
    }
}