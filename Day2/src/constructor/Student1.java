/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

public class Student1 {
    String name;
    int age;
    Student1(){
        System.out.println("default");
    }
    Student1(String name,int age){
        //this();
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name+" "+age);
    }
    public static void main(String [] args){
        Student1 s1= new Student1("shravya",18);
        s1.display();
        
    }
    
}
