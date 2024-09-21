import java.util.Scanner;

public class FirstNnumbers 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int counter=1;
        while(N>0)
        {
            
            System.out.print(counter+" ");
            counter++;
            N--;
        }
    }
    
}
