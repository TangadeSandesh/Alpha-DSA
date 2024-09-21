import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(5);

        Collections.sort(list);
        System.out.print(list+" ");

        Collections.sort(list,Collections.reverseOrder());
        System.out.print(list+" ");


    }
}
