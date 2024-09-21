public class SelectionSort {

    static void selection_sort(int A[])
    {
       for(int i=0;i<A.length-1;i++)
       {
            int minpos=i;
            for(int j=i+1;j<A.length;j++)
            {
                if(A[minpos]>A[j])
                {
                    minpos=j;
                }
            }
            //Swap
            int temp=A[i];
            A[i]=A[minpos];
            A[minpos]=temp;

       } 
        
    }
    public static void main(String args[])
    {
        int[] A={5,4,3,2,1};

        selection_sort(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        
    }
}
