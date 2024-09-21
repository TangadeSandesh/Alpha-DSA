import java.util.Scanner;

class DiagonalSum
{
    static void diagonalsum(int[][] A)
    {
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum= sum+ A[i][i];

            if(i!=A.length-1-i)
            {
                sum=sum+ A[i][A.length-1-i];

            }
        }
        System.out.println(sum);

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[3][3];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                A[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        diagonalsum(A);
    

    }
}