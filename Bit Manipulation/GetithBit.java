public class GetithBit {

    static int getIthBit(int N, int i)
    {
        int bitmask=1<<i;
        
        if((N & bitmask)==0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String args[])
    {
         
        System.out.println(getIthBit(5,3));         
    }
}
