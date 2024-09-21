import java.util.Scanner;

public class PrimeNum {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        

        if(N==2)
        {    System.out.println("Number is prime Number");
            }   
        else
        {
            boolean isPrime=true;
            for(int i=2;i<Math.sqrt(N);i++)
            {
            if(N%i==0)
            {
                isPrime=false;
                }
            }
            
            if(isPrime)
            {
                System.out.println("Number is prime Number");
                }
            else
                System.out.println("Number is not prime Number");
        
    }
        
        
    }   
}
