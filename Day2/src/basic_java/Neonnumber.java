
package basic_java;
import java.util.Scanner;
public class Neonnumber {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int sum = 0;

        // Calculate sum of digits of square
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is a Neon Number.");
        } else {
            System.out.println(n + " is NOT a Neon Number.");
        }
    }
}

  
