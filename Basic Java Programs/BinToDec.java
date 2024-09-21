public class BinToDec 
{
    static void BinNumToDec(int n)
    {
        int mynum=n;
        int pow=0;
        int dec=0;

        while(n>0)
        {
            int lastnum=n%10;
            dec=dec+(int)(lastnum*Math.pow(2,pow));
            pow++;
            n=n/10;

        }
        System.out.print("decimal number of "+ mynum+" is "+dec);
    }
    public static void main(String args[])
    {
        BinNumToDec(1000);
    }
    
}
