
package Inheritance;
class Animal {
    void print(){
        System.out.println("sound");
        }
}
class dog extends Animal{
    void sound(){
        System.out.println("bark");
    }
}

class puppy extends Animal{
    void display(){
        System.out.println("puppy class");
    }
}
public class Animalss {
    public static void main(String[] args) {
        dog ob1=new dog();
        puppy ob=new puppy();
        ob.display();//puppy
        ob1.sound();//dog
        ob.print();//animal
        
    }
    
}
                                                                                                                                
