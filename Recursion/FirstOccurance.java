public class FirstOccurance {
    static int firstOccurance(int[] A, int key, int i)
    {
        if(i>A.length)
        {
            return -1;
        }
        if(A[i]==key)
        {
            return i;
        }
        return firstOccurance(A, key, i+1);
    }

    public static void main(String args[])
    {
        int[] A={1,3,5,7,2};
        System.out.println(firstOccurance(A,7,0));
    }
    
}
