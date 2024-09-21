import java.util.HashSet;

public class DistinctCount {
    public static void main(String args[])
    {
        int[] A={1,4,3,2,4,1,5,3};

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<A.length;i++)
        {
            set.add(A[i]);
        }
        System.out.println(set.size());
    }
}
