public class PrintXoptimized {
    public static int optmPow(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        int halfresult=optmPow(x,n/2)*optmPow(x,n/2);

        if(n%2!=0)
        {
            return halfresult*x;
        }
        else{
            return halfresult;
        }
        
    }
    public static void main(String args[])
    {
        System.out.println(optmPow(2,10));
    }
}
