public class BubbleSort {

    static int[] bubble_sort(int A[])
    {
        for(int i=0;i<=A.length-1;i++)
        {   // i==no. of turns 
            for(int j=0;j<A.length-1-i;j++)
            {   //iterate with comparing             
                if(A[j]>A[j+1])
                {
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        return A;
    }
    public static void main(String args[])
    {
        int[] A={4,3,2,1};

        bubble_sort(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
