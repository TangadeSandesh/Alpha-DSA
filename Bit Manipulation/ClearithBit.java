public class ClearithBit 
{
    static int clearIthBit(int N, int i)
    {
        int bitmask=~(1<<i);

        return (N & bitmask);
    }

    public static void main(String args[])
    {
        
        System.out.println(clearIthBit(8,3));
    }
}
