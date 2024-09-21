import java.util.HashMap;
import java.util.Set;

class MajorityElement
{
    public static void main(String args[])
    {
        int[] A={1,3,2,5,1,3,1,5,1};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0; i<A.length; i++)
        {
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }

        Set<Integer> key=map.keySet();
        for(Integer k:key)
        {
            if(map.get(k)>A.length/3)
            {
                System.out.println(k);
            }
        }

    }
}