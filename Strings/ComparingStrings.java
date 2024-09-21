package Strings;

public class ComparingStrings {
    public static void main(String args[])
    {
        String s1="Sandesh";
        String s2=new String("Sandesh");

        if(s2.equals(s1))
        {
            System.out.print("Sttrings are equals.");

        }
        else{
            System.out.print("Sttrings are not equals.");
        }
    }
}
