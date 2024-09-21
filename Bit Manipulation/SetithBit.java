public class SetithBit {
    public static int setIthBit(int N, int i)
    {
        int bitmask=1<<i;
        return (N | bitmask);
    }

    public static void main(String args[])
    {
        System.out.println(setIthBit(30, 10));
    }
}
