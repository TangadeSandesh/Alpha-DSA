import java.util.Stack;

public class ReverseString {
    public static boolean isEmpty(Stack<Character> c)
    {
        return c.size()==0;
    }
   
    static String reverseString(Stack<Character> c, String str)
    {
        int i=0;
        while(i<str.length())
        {
            c.push(str.charAt(i));
            i++;
        }

        StringBuilder sb=new StringBuilder();

        while(!isEmpty(c))
        {
            char curr=c.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String args[])
    {
        Stack<Character> c=new Stack<>();
        String str="abc";

        String rev=reverseString(c,str);
        System.out.println(rev);
    }
}
