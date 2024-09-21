public class ZeroOneKnapsackRecursion
{
    public static int knapsack(int[] wt, int[] val, int w, int i)
    {
        if(w==0 || i==0)
        {
            return 0;
        }

        if(wt[i]<=w)
        {
            //include
            int ans1= val[i-1] + knapsack(wt, val, w-wt[i], i-1);

            //exclude
            int ans2= knapsack(wt,val,w, i-1);

            return Math.max(ans1, ans2);
        }
        else{
            //exclude
            return knapsack(wt, val, w, i-1);
        }
    }
    public static void main(String args[])
    {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,2,3,4};
        int w=7;

        int profit= knapsack(wt, val, w, val.length);
        System.out.println("Max profit="+profit);
    }
    
}

//TC=O(2^n)