public class PairsOfElements 
{
    static void pair_elements(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            int curr=A[i];
            for(int j=i+1; j<A.length;j++)
            {
                System.out.print("("+ curr + ","+ A[j] + ")");

            }
            System.out.println();

        }   
    }
    public static void main(String args[])
    {
        int[] A={1,2,3,4,5,6,7};

        pair_elements(A);
    }   
}
