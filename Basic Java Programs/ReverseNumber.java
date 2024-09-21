// import java.util.Scanner;

// public class ReverseNumber {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int N=sc.nextInt();
//         int rev=0;
//         for(int i=N;i>0;i--)
//         {
//             rev=rev*10+N%10;
//             N=N/10;
//             i=N;
//         }
//         System.out.println("Reverse="+rev);
        
//     }     
// }


import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int rev=0;
        while(N>0)
        {
            rev=rev*10+N%10;
            N=N/10;
            
        }
        System.out.println("Reverse="+rev);
        
    }     
}
