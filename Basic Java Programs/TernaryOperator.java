import java.util.Scanner;

public class TernaryOperator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        String Type=(a%2==0)?"even":"odd";

        System.out.print("Number is "+Type);

    }
    
}
