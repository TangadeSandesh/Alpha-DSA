import java.util.ArrayList;
import java.util.List;

class operationsArrayList
{
    public static void main(String args[])
    {
        List<Integer> list=new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.get(2));

        list.remove(2);
        list.set(2,100);
        //System.out.println(list.get(2));

        
        System.out.println(list.size());

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }

        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}