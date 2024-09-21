import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidPar(String str)
    {
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((str.charAt(i)=='{') || (str.charAt(i)=='(') || (str.charAt(i)=='[')) //opening
            {
                s.push(str.charAt(i));
            }
            else{ //closing bkackets
                if(s.isEmpty())
                {
                    return false;
                }
                if((s.peek()=='(' && ch==')')|| (s.peek()=='{' &&  ch=='}')|| (s.peek()=='[' && ch==']'))
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }
            

        }
        if(s.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        } 
    }
    public static void main(String args[])
    {
        String str="(])";

        System.out.println(isValidPar(str));

        
    }
}
