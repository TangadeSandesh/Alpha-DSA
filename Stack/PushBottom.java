import java .util.Stack;

class PushAtBottom
{
     public static boolean isEmpty(Stack<Integer> s)
        {
            return s.size()==0;
        }
    static void pushAtBottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int data=4;

        pushAtBottom(s,data);

        while(!isEmpty(s))
        {
            System.out.println(s.pop());
        }




    }
}