public class ReverseArray {

    static int[] reverse_array(int A[])
    {
        int n=A.length;
        int first=0;
        int last=n-1;

        while(first<last)
        {
            int temp=A[first];
            A[first]=A[last];
            A[last]=temp;
            
            first++;
            last--;
        }

        return A;
    }
    public static void main(String args[])
    {
        int[] A={1,2,3,4,5,6,8};

        reverse_array(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}
