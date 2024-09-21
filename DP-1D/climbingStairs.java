public class climbingStairs {

    public static int countWays(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<1)
        {
            return 0;
        }

        return countWays(n-1)+countWays(n-2);
    }
    public static void main(String args[])
    {
        int n=5;

        int ways=countWays(n);
        System.out.println("The number of ways= "+ ways);
    }
}
