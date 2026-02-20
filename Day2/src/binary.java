import java.util.Scanner;
public class binary {
    public static void main(String args[]){
        int i=1, n=6;
    
        int count=0;
        
        while(n!=0)
        {
            if((n&1)==1)
            {
                count++;
            }
            n=n>>1;
            
        }System.out.println("no of count"+count);
    }
}
