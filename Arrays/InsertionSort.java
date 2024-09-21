class InsertionSort
{
    static void insertion_sort(int[] A)
    {
        for(int i=1;i<A.length;i++)
        {
            int curr=A[i];
            int prev=i-1;

            //finding out the correct position to insert
            while(prev>=0 && A[prev]>curr)
            {
                A[prev+1]=A[prev];
                prev--;
            }

            //insertion
            A[prev+1]=curr;

        }
    }
    public static void main(String args[])
    {
        int[] A={5,4,3,2,1};

        insertion_sort(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        
    }
}