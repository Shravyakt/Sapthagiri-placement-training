/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acess_modifiers;

public class ex1 {
    int a;
    int b;
    
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main (String args[]){
        ex1 ob = new ex1();
        ob.a=10;
        ob.b=20;
        ob.display();
        
}
}