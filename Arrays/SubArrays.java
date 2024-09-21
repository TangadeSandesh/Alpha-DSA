public class SubArrays 
{
    static void subArrays(int[] A)
    {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {   
            
            int start=i;
            for(int j=i;j<A.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    sum=sum+A[k];
                    System.out.print(A[k]+" ");
                }
                System.out.print("="+sum);
                if(maxSum<sum)
                {
                    maxSum=sum;
                }
                sum=0;
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println("Maximum sum="+ maxSum);
    }
    public static void main(String args[])
    {
        int[] A={1,3,5,7,9};

        subArrays(A);
    }
}
