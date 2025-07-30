package twentynine;
import java.util.*;
//pb: create a student class with private name,rollnumber,marks. create 
//getters and setters with validations(marks must be 1-100)
public class Student {
    private String name;
    private String rollnumber;
    private int marks;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setRollno(String rollno){
        this.rollnumber=rollno;
    }
    public String getRollno(){
        return rollnumber;
    }
    public void setMarks(int marks){
        if(marks>=0 && marks<=100){
        this.marks=marks;}
        else{
            System.out.println("Enter valid marks");
        }
    }
    public int getMarks(){
        return marks;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        s.setMarks(13);
        s.setName("pranav");
        s.setRollno("22491a6746");
        System.out.println("my name is "+s.getName()+" and my roll no is "+s.getRollno()+" check marks ");;
        System.out.println("your marks are "+s.getMarks());
    }
}
