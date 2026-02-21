/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_keyword;
class parent{
    parent(){
        System.out.println("parent");
    }
}
public class child1 extends parent{
    child1(){
        super();
        System.out.println("child");
    }
    public static void main (String args[]){
        child1 ob = new child1();
    }
}//super using constructor
