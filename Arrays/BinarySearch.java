public class BinarySearch {

    static int binary_search(int A[], int key)
    {
        int n=A.length;
        int start=0;
        int end=(n-1);
        while(start<=end)
        {
            int mid=(start+end)/2;

            if(A[mid] == key)
            {
                return mid;
            }
            if(A[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            
        }
        return -1;

    }
    public static void main(String args[])
    {
        int[] A={1,2,3,4,5,6,7};
        int key=7;

        int index=binary_search(A, key);

        if(index==-1)
        {
            System.out.println("index not found");
        }
        else
        {
            System.out.println("Index of key "+key+" is "+index);
        }
        
    }
}
