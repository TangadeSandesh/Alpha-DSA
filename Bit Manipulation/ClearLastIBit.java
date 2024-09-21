class CleaarLastIBit 
{
    static int clearLastIthBit(int N, int i)
    {
        int bitmask=(~0)<<i;

        return N & bitmask;
    }

    public static void main(String args[])
    {
        System.out.println(clearLastIthBit(15,2));
    }
    
}
