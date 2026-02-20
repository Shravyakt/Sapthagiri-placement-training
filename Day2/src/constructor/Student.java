
package constructor;
public class Student {
    
    String name;
    int age;
    Student(String n,int a){
       this. name=n;
       this. age=a;
    }
    void display(){
        System.out.println(name + " "+age);
    }
    public static void main(String[]args){
        Student ob=new Student("shravya",22);
        ob.display();
        ob.name="shra";
        ob.age=18;
        System.out.println(ob.name+" "+ob.age);
    }
    
}
