import java.util.Scanner;

public class SwitchSta {
public static void main (String args[])
{
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    switch(N){
        case 1 :
            System.out.print("Samosa");
            break;
        case 2 :
             System.out.print("Burger");
             break;
        case 3 :
            System.out.print("pine apple Shake");
            break;
        default :
             System.out.print("We realize,Its Dream");
             break;
    }
    
}    
}
