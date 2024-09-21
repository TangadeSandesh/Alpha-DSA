public class Factorial 
{
    static int fact(int N)
    {
        if(N==0)
        {
            return 1;
        }
        int fact= N*fact(N-1);
        return fact;
    }


    public static void main(String args[])
    {
       System.out.println(fact(5)); 
    }
}
