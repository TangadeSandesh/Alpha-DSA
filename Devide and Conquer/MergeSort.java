public class MergeSort {
    static void mergeSort(int[] A, int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=(si+ei)/2;
        mergeSort(A,si,mid);
        mergeSort(A,mid+1,ei);
        merge(A,si,ei, mid);
    }
    static void merge(int[] A, int si, int ei, int mid){
        int[] temp=new int[ei-si+1];

        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei)
        {
            if(A[i]<A[j])
            {
                temp[k]=A[i];
                i++;
            }
            else{
                temp[k]=A[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
             temp[k]=A[i];
                i++;k++;
        }
          while(j<=ei)
        {
             temp[k]=A[j];
                j++;k++;
        }

        for(k=0,i=si;k<temp.length;k++,i++)
        {
            A[i]=temp[k];
        }
    }

    public static void main(String args[])
    {
        int[] A={4,5,6,6,2,-2};

        System.out.print("UnsortedArray=");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }

         System.out.println();
        mergeSort(A, 0, A.length-1);
         System.out.print("SortedArray=");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }

    }
}
