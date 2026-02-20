
package constructor;
public class Employee {

 String name;
 int id;
 double salary;
 Employee(String name,int id,double salary){
     this.name=name;
     this.id=id;
     this.salary=salary;
 }
 void details(){
     System.out.println("Name="+name );
     System.out.println("Id="+id );
      System.out.println("salary="+salary );
}
public static void main(String args[]){
    Employee e1 = new Employee("skt",1,10000);
    Employee e2 = new Employee("ktbs",2,10000);
    
    e1.details();
    e2.details();
}
} 