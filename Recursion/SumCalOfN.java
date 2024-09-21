public class SumCalOfN 
{   
    static int sumCalN(int N)
    {
        if(N==1)
        {
            return 1;
        }
        return N+sumCalN(N-1);
    }

    public static void main(String args[])
    {
        System.out.println(sumCalN(2));
    }
}
