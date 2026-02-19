/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package placement.jav;
import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner ob=new Scanner (System.in);
        System.out.println("enter a no=");
        
        int n = ob.nextInt();
        int temp=n,sum=0;
        int count=0;
        
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        
        temp = n;
        
        while (temp !=0){
          int d = temp%10;
          sum += Math.pow(d,count);
          temp=temp/10;
         }
        
        if(n==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("not Armsrong");
        }
    }
}

