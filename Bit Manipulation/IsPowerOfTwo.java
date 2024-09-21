public class IsPowerOfTwo 
{
    static boolean ispowerOfTwo(int N)
    {
        return (N & (N-1))==0;
    }


    public static void main(String args[])
    {
        System.out.println( ispowerOfTwo(16));
    }
}
