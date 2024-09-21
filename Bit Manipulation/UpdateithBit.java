
class UpdateithBit
{
   public static int updateIthBit(int N, int i, int newbit) 
    {
        // if(newbit==0)
        // {
        //     return clearIthBit(N, i);
        // }
        // else{
        //     return seIthBit(N, i);
        // }

        int bitmask=~(1<<i);
        int clearedBit= N & bitmask;
        
        int bitmask2=(newbit<<i);
        return clearedBit | bitmask2;
    }
    public static void main(String args[])
    {
        System.out.println(updateIthBit(10,2,1));
    }
}
