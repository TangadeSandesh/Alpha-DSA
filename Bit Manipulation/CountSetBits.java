public class CountSetBits 
{
    static int setCountBits(int N)
    {
        int count=0;

        while(N>0)
        {
            if((N & 1)!=0)
            {
                count++;
            }
            N=N>>1;
        }
        return count;
    }
    public static void main(String args[])
    {
        System.out.println(setCountBits(16));
    }
}
