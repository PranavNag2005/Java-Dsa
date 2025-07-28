package twentyeight;
class Person{
    int age;
    String name;
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
}
public class Employee extends Person {
    int salary;
    public Employee(int age,String name,int salary){
        super(age,name);
        this.salary=salary;
    }public static void main(String[] args) {
        
    
    Employee e=new Employee(12, "pranav", 1233);
        System.out.println("my name is "+e.name+" and my age is "+e.age+" and my company pay be "+e.salary);
    }
}
