import java.util.ArrayList;

class MaxElement{
    public static void main(String args[]) {
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(int i=0;i<list.size();i++)
        {
            if(max<list.get(i))
            {
                max=list.get(i);

            }
        }
        System.out.println(max);
    }
}

