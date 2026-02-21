
package override;
class parent {

    void show() {
        System.out.println("parent static method");
    }
}
 public  class child2 extends parent {
    @Override
       void show() {
        System.out.println("child ststic method");
    }

   public static void main(String args[]) {
        parent ob = new child2();
        ob.show();

    }
}
    
