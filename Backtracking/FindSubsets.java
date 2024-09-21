class FindSubsets
{
    static void findSubsets(String str, String ans, int i)
    {
        if(i==str.length())
        {
            if(ans=="")
            {
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        findSubsets(str, ans+str.charAt(i), i+1);
        findSubsets(str, ans, i+1);
    }
    public static void main(String args[])
    {
        String str="abc";
        String ans="";
        findSubsets(str, ans, 0);
    }  

}