import java.util.ArrayList;

public class TwoPointerForMaxWater {
    static int storeWater(ArrayList<Integer> height)
    {
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;

        while(lp<rp)
        {
            int ht=Math.min(height.get(lp),height.get(rp));
            int wd=rp-lp;
            int currWater=ht*wd;
            maxWater=Math.max(maxWater, currWater);

            if(height.get(lp)<height.get(rp))
            {
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;

    }
    public static void main(String args[])
    {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(10);
        height.add(20);
        height.add(5);
        height.add(4);
        
        System.out.println(storeWater(height));
    }
}
