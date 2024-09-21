class ArrayBacktracking
{
    static void changeArr(int[] A,int i, int val)
    {
        if(i==A.length)
        {
            printArr(A);
            return;
        }
        A[i]=val;
        changeArr(A, i+1, val+1);
        A[i]=A[i]-2;

    }
    static void printArr(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int[] A=new int[5];
        int i=0;
        int val=1;
        changeArr(A, i, val);
        printArr(A);
        

    }
}