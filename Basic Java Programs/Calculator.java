import java.util.Scanner;

public class Calculator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+' :
                System.out.println("Addition="+ a+b);
                break;
            case '-' :
                System.out.println("Subtraction="+ (a-b));
                break;
            case '*' :
                System.out.println("Multiplication="+ a*b);
                break;
            case '/' :
                System.out.println("Division="+ a+b);
                break;
            default :
                System.out.println("Its not so PRO calculator");
                break;
            
        }
    }
    
}
