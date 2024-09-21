public class CheckSorted 
{
    static boolean isSorted(int A[], int i)
    {
        if(i==A.length-1)
        {
            return true;
        }
        if(A[i] > A[i+1])
        { 
            return false;
        }

        return isSorted(A, i+1);
    }
    public static void main(String args[])
    {
        int[] A={1,3,5,7,2};
        System.out.println(isSorted(A, 0));
    }
    
}
