import java.util.Arrays;

public class InbuiltSorting {
    public static void main(String args[])
    {
        int[] A={3,4,7,6,32,};

        Arrays.sort(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        

        Arrays.sort(A,0,3);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        

    }
}
