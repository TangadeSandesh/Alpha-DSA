class NumInDecreasing
{
    static void numInDecreasing(int N)
    {
        if(N==1)
        {
            System.out.print(N);
            return;
        }
        System.out.println(N+" ");
        numInDecreasing(N-1);

    }

    static void numIncreasing(int N)
    {
        if(N==1)
        {
            System.out.print(N);
            return;
        }
        numIncreasing(N-1);
        System.out.println(N+" ");
        

    }

    public static void main(String args[])
    {
        int N=10;
        numInDecreasing(N);
        
        System.out.println();
        numIncreasing(N);
    }
}