import java.util.Scanner;

public class DoWhile {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.print("Enter a Number:");
            int N=sc.nextInt();

            if(N%10==0)
            {
                break;
            }
            System.out.println(N);

        }while(true);

    }    
}
