import java.util.ArrayList;
import java.util.Collections;

public class IsPairSum {

    static boolean pairSumTwoPointer(ArrayList<Integer> list,int target)
    {
        int lp=0;
        int rp=list.size()-1;
        int sum=0;

        while(lp<rp)
        {
            sum=list.get(lp)+list.get(rp);
            if(sum==target)
            {
                return true;
            }
            else if(sum<target)
            {
                lp++;
            }
            else if(sum>target)
            {
                rp--;
            }

        }
        return false;

    }
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(3);
        list.add(9);

        Collections.sort(list);
        int target=6;

        System.out.println(pairSumTwoPointer(list,target));
    }
}
