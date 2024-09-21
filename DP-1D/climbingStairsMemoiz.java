import java.util.Arrays;

public class climbingStairsMemoiz {

    public static int countWays(int n, int[] ways)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(ways[n]!=-1)
        {
            return ways[n];
        }
        ways[n]=countWays(n-1,ways) + countWays(n-2, ways);

        return ways[n];
    }
    public static void main(String args[])
    {
        int n=5;
        int[] ways=new int[n+1];
        Arrays.fill(ways, -1);

        int nWays=countWays(n, ways);

        System.out.println("the number of ways=" + nWays);
    }
}


//TC = O(n)