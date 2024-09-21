class DecToBin
{
    static void DecToBinNum(int n)
    {
        int mynum=n;
        int pow=0;
        int Bin=0;

        while(n>0)
        {
            int lastnum=n%2;
            Bin=Bin+(lastnum * (int)Math.pow(10,pow));

            pow++;
            n=n/2;
        }
        System.out.println("Binary of the decimal "+mynum+" is "+Bin);

    }
    public static void main(String args[])
    {
        DecToBinNum(9);


    }
}