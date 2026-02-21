/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day3;
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

class puppy extends dog{
    void display(){
        System.out.println("puppy class");
    }
}

public class Day3 {

  
    public static void main(String[] args) {
        puppy ob=new puppy();
        ob.display();//puppy
        ob.sound();//dog
        ob.print();//animal
        
    }
    
}
