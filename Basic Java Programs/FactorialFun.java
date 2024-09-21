import java.util.*;

class FactorialFun
{
   
        static int factorial(int n)
        {
            int f=1;

            for(int i=1;i<=n;i++)
            {
                f=f*i;

            }
            return f;
        }

        static int binomialcoeff(int n, int r)  
        {
            int fact_n=factorial(n);
            int fact_r=factorial(r);
            int fact_nmr=factorial(n-r);            

            int binCoeff=fact_n/(fact_r*fact_nmr);
            return binCoeff;
        }

     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int F=factorial(n);
        int B=binomialcoeff(n,r);

        System.out.println(F);
        System.out.println(B);

    }
}