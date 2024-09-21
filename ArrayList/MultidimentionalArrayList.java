import java.util.ArrayList;

public class MultidimentionalArrayList {
    public static  void main(String args[])
    {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);

        mainlist.add(list1);
        mainlist.add(list2);

        //System.out.print(mainlist);

        for(int i=0; i<mainlist.size(); i++)
        {
            ArrayList<Integer> currList=mainlist.get(i);
            for(int j=0; j<currList.size();j++)
            {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }










    }
}
