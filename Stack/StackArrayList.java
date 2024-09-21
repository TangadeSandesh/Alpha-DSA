import java.util.ArrayList;

class StackArrayList
{
    static ArrayList<Integer> list=new ArrayList<>();

        public static boolean isEmpty()
        {
            return list.size()==0;
        }

        //Push operation
        public void push(int data)
        {
            list.add(data);
        } 
        
        //pop operation
        public static int  pop()
        {
            int top=list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            return top;
        }

        //peek operation
        public static int  peek()
        {
            return list.get(list.get(list.size()-1));

        }


    public static void main(String args[])
    {
        StackArrayList s=new StackArrayList();

        s.isEmpty();
        s.push(1);
        s.push(10);
        s.push(20);

        s.pop();
        s.peek();

        System.out.println(s);

    }
}