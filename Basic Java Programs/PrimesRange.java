import java.util.Scanner;

public class PrimesRange 
{
    static boolean isPrime(int n)
    {
        boolean isPr=true;

         for(int i=2;i<(n);i++)
        {
            if(n%i==0)
            {
                isPr=false;
            }
        }
        return isPr; 
    }

    public static void primesInRange(int m)
    {
        //int n=m;
        for(int i=2;i<=m;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }

        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int  N=sc.nextInt();
        primesInRange(N);
       
        
    }
}
