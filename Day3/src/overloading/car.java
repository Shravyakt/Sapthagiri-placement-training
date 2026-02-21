package overloading;

class Vehicle {

   static void speed() {
        System.out.println("vehicle have different speed ranges");
    }

    static void speed(int maxspeed) {
        System.out.println("Maximum speed of the vehicle is"+maxspeed);

    }
}

public class car extends Vehicle {

    static void speed(String mode) {
        System.out.println("car is running in "  +  mode   +" mode.");
    }

    public static void main(String args[]) {
        car ob = new car();
        ob.speed();
        ob.speed(100);
        ob.speed("swag");
       
    }

}
