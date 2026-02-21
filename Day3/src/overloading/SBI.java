package overloading;
class Bank{
    static void interest(){
        System.out.println("Bank provides interest on deposits.");
    }
 
 static void interest(double rate){
 System.out.println("interest rate:"+rate+"%");
}
}

public class SBI extends Bank {
    void interest(double rate,int years){
        double principal = 1000;
        double totalInterest=(principal*rate*years)/100;
        System.out.println("total interest for"+years+"years:"+totalInterest);
        
    }
    
    public static void main (String args[]){
        SBI ob = new SBI();
        ob.interest();
        ob.interest(12.0);
        ob.interest(12.0,5);
        
    }
    
}
