/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package static_ex;
public class Counter {
    //static int count=0;
    int count=0;
    int id;
    
    Counter(){
        count++;
        id=count;
        System.out.println("Object ID:"+id);
    }
    
    public static void main (String[]args){
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        
        System.out.println("Total Objects Created:"+c1.count);
        //count instead of c1.count while executing with static
    }
    
}
//if u want 1,2,3 then remove comment for static