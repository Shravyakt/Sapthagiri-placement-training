
package placement.jav;
import java.util.Scanner;
public class digit {
    public static void main (String[] args){
        Scanner ob=new Scanner(System.in);
        
        System.out.println("enter no=");
        int n=ob.nextInt();
        int count=0;
        if(n==0){
        System.out.println("no of digits="+1);
        }
        else{
            while(n!=0){
                count ++;
                n=n/10;
            }
            System.out.println("no of digits="+count);
        }
    }
}
        
    

