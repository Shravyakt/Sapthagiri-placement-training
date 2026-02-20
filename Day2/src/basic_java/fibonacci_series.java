/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic_java;

public class fibonacci_series {
    void fibonacci(int n){
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
}
public static void main(String args[]){
    fibonacci_series ob=new fibonacci_series();
    ob.fibonacci(7);

}
} 