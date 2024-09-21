public class ClearRangeofBits 
{
    static int clearIBits(int N, int i, int j)
    {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a | b;

        return N & bitmask;

    }

    public static void main(String args[])
    {
        System.out.println(clearIBits(10,2,4));
    }
}
