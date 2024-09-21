public class LastOccurance {
    static int lastOccurance(int[] A,int key, int i)
    {
        if(i==A.length)
        {
            return -1;
        }

        int isfound =lastOccurance(A,key,i+1);
        if(isfound==-1 && A[i]==key)
        {
            return i;
        }
       return isfound;


    }

    public static void main(String args[])
    {
        int[] A={1,3,5,7,2};
        System.out.println(lastOccurance(A,7,0));
    }
    
}
