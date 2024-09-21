import java.util.HashMap;
import java.util.Set;

public class ValidAnagram {
    public static boolean isValidAnagram(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> countMap=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            countMap.put(s.charAt(i),countMap.getOrDefault(s.charAt(i),0)+1);
        }

       for(int i=0;i<t.length();i++)
       {
            char ch=t.charAt(i);
            if(countMap.get(ch)!=null)
            {
                if(countMap.get(ch)==1)
                {
                    countMap.remove(ch);
                }
                else{
                    countMap.put(ch,countMap.get(ch)-1);
                }
            }
            else{
                return false;
            }
       }
       return countMap.isEmpty();
        
    }
    public static void main(String args[])
    {
        String s="car";
        String t="rac";

        boolean isvalid=isValidAnagram(s,t);
        System.out.println(isvalid);
    }
}
