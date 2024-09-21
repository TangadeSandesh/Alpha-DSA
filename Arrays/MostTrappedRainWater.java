public class MostTrappedRainWater {
    public static int trappedRainWater(int[] height)
    {
        int n=height.length;
        //left max boundaries- Array
        int[] leftb=new int[n];
        leftb[0]=height[0];
        for(int i=1; i<n; i++)
        {
            leftb[i]=Math.max(height[i],leftb[i-1]);
        }
        //right max boundaries- Array
        int[] rightb=new int[n];
        rightb[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--)
        {
            rightb[i]=Math.max(height[i],rightb[i+1]);
        }

        
        int waterlevel;
        int trappedwater=0;
        for(int i=0; i<n; i++)
        {
            //waterlevel= min(leftboundary, rightboundary)
            waterlevel=Math.min(leftb[i],rightb[i]);

             //trappedRainwater= waterlevel - barHeight;
            trappedwater+=waterlevel - height[i];
        }
        return trappedwater;
       
    }
    public static void main(String args[])
    {
        int[] height={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}
