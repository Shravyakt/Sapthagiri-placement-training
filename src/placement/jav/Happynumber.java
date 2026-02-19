
package placement.jav;
import java.util.Scanner;
public class Happynumber {
    public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number:");//19
       int n=sc.nextInt();
       int temp=n;//19
       while(temp!=1 && temp!=4){//19<>1 & 19<>4
           int sum=0;
           while(temp>0){//19>0
               int digit=temp%10;//19%10=9
               sum+=digit*digit;//81
               temp/=10;//19/10=1
            }
           temp=sum;
        }
    if (temp==1)
        System.out.println(n+"is a Happy Number");
    else
        System.out.println(n+"is not a Happy Number");
    }
}
