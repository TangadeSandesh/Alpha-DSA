class LargestNum
{
     static int largest_num(int A[])
        {
            int largest=Integer.MIN_VALUE;

            for(int i=0;i<A.length;i++)
            {
                if(largest<A[i])
                {
                    largest=A[i];
                }

            }
            return largest;
        } 
    public static void main(String args[])
    {
        int A[]={1,3,5,7,9,3};

        int largest=largest_num(A);
        System.out.println("largest number is "+largest);
        
    }

   
}