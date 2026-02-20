
package placementd2;
public class method {
    void print(){
        System.out.println("hello");
        return;
        //System.out.println("hi");//after return statement we cant write anything it is unreachable
    }
    public static void main(String args[]){
        method ob=new method();
        ob.print();
    }
    
}
