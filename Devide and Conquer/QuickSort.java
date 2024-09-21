class QuickSort
{
    static void quickSort(int A[], int si, int ei)
    {
        if(si>=ei)
        {
            return ;
        }
        int pvIndx= partition(A, si, ei);
        quickSort(A, si, pvIndx-1); //left
        quickSort(A, pvIndx+1, ei);  // right

    }

    static int partition(int A[], int si, int ei)
    {
        int pivot=A[ei];
        int i=si-1;
        for(int j=si; j<ei; j++)
        {
            if(A[j]<=pivot)
            {
                i++;
                int temp=A[j];
                A[j]=A[i];
                A[i]=temp;
            }
        }
                i++;
                int temp=pivot;
                A[ei]=A[i];
                A[i]=temp;
                return i;
    }
        
    public static void main(String args[])
    {
        int[] A={3,5,7,2,6,3};

        quickSort(A,0,A.length-1);
        // System.out.print(A[0]);
        for(int j=0; j<A.length; j++)
        {
            System.out.print(A[j]+" ");
        }
    }
}
