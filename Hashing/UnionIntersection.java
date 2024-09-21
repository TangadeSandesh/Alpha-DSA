import java.util.HashSet;

public class UnionIntersection {
    public static void main(String args[])
    {
        int[] A1={6,3,9,2};
        int[] A2={7,2,5,3,9,4};
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<A1.length;i++)
        {
            set.add(A1[i]);
        }
        for(int i=0;i<A2.length;i++)
        {
            set.add(A2[i]);
        }

        System.out.println(set.size());

       //Intersection
       set.clear();

       for(int i=0;i<A1.length;i++)
        {
            set.add(A1[i]);
        }
        int count=0;
        for(int i=0;i<A2.length;i++)
        {
            if(set.contains(A2[i]))
            {
                count++;
                set.remove(A2[i]);
            }
        }
        System.out.println(set.size());
    }
}
