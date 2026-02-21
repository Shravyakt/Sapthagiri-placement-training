
package Encapsulation;
public class Main {
    public static void main (String args[]){
        Student ob = new Student("shrav",19);
        System.out.println(ob.getname());
        
        
        ob.setname("shravya");
        System.out.println(ob.getname());
                
    }
    
}
