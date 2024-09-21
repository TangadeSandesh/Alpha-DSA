public class TilingProblem {

    public static int countWays(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        //vertical 
        int vWays=countWays(n-1);

        //Horizontal
        int hWays=countWays(n-2);

        return vWays+hWays;

    }
    public static void main(String args[])
    {
        int n=3;

        System.out.println("The number of ways="+countWays(n));
    }
}
