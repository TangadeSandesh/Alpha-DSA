class CheckBinEvenOdd
{
static void checkEvenOdd(int N)
{
    int bitmask=1;

    if((N & bitmask) == 0)
    {
        System.out.println("Even number");
    }
    else
    {
        System.out.println("Odd number");
    }
}

    public static void main(String args[])
    {
        checkEvenOdd(100);
    }
}