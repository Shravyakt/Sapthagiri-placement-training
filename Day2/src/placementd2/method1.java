package placementd2;

public class method1 {

    int factorial(int d) {
        int fact = 1;
        for (int i = 1; i <= d; i++) {
            fact = fact * i;
        }
        return fact;
    }

    boolean isStrong(int n) {//145
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum = sum + factorial(d);
            n = n / 10;
        }

        if (sum == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        method1 ob = new method1();
        if (ob.isStrong(145)) {
            System.out.println("is Strong number");
        } else {
            System.out.println("not");

        }

    }
}
