import java.util.*;
class Employee{
    void info(String name,int year,String Address){
        System.out.print(name+" \t" + year +" \t"+Address+"\n");
    }
}
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Name"+" \t"+"year of joining"+"  \t"+"Address");
        Employee one= new Employee();
        Employee two= new Employee();
        Employee three= new Employee();
        one.info("robert",1994,"64C-WALLS STREET");
        two.info("SAM",2000,"68D-Walls Street");
        three.info("John",1999,"26B-Walls Street");
     }
}
