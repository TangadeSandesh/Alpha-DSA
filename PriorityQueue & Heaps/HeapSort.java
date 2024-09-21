public class HeapSort {

    public static void heapSort(int[] A)
    {
        maxHeap(A);
        int n=A.length;

        for(int i=n-1; i>=0; i--)
        {
            int temp=A[0];
            A[0]=A[i];
            A[i]=temp;

            heapify(A,0,i);
        }
    }
    public static void maxHeap(int[] A)
    {
        int n=A.length;
        for(int i=n/2; i>=0; i--)
        {
            heapify(A,i,i);
        }
    }
    public static void heapify(int[]A, int i, int size)
    {  
        int left=2*i+1;
        int right=2*i+2;
        int maxIndx=i;

        if(left<size && A[left] > A[i])
        {
            maxIndx=left;
        }
        if(right<=size && A[right] > A[i])
        {
            maxIndx=right;
        }
        else{
            maxIndx=i;
        }
        if(maxIndx!=i)
        {
            int temp=A[i];
            A[i]=A[maxIndx];
            A[maxIndx]=temp;

            heapify(A,maxIndx,size);
        }

    }
    public static void main(String args[])
    {
        int[] A={3,5,2,6,1,4};

        heapSort(A);

        for(int i=0;i<A.length; i++)
        {
            System.out.print(A[i]+" ");
        }

    }
}
