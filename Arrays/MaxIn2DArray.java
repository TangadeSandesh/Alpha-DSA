import java.util.Scanner;

public class MaxIn2DArray 
{
    static void MaxMinElement(int A[][])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(A[i][j]>max)
                {
                    max= A[i][j];
                    
                }
                if(A[i][j]<min)
                {
                    min=A[i][j];   
                    
                }
                

            }
            

        }
        System.out.println("Maximum Number="+max);
        System.out.println("Minimum Number="+min);
    } 

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                A[i][j]=sc.nextInt();
            }
            System.out.println();

        }
        MaxMinElement(A);


    }
    
}
