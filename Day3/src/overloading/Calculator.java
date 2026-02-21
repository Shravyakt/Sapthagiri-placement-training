/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

public class Calculator {

    static void calci(int a, int b) {//by using static word no need to creat object it creates classes of its own
        System.out.println(a + b);
    }

    static void calci(double a, double b) {
        System.out.println(a * b);
    }

    static int calci(int a, int b, int c) {
        return (a + b) / c;
    }

    public static void main(String args[]) {
        calci(5, 8);
        calci(10.9, 7.9);
        System.out.println(calci(7, 9, 13));
    }

}
