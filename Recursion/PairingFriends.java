public class PairingFriends {

    public static int countPairs(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        //single
        int sPairs=countPairs(n-1);

        //want to make pair
        int pairs=countPairs(n-2);
        
        return sPairs + (n-1)*pairs;
    }
    public static void main(String args[])
    {
        int n=3;

        System.out.println("The number of Pairs="+countPairs(n));
    }
}
