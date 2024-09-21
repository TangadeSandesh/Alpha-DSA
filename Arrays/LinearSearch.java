import java.util.Scanner;

class LinearSearch
{
    static int LSearch(int A[], int key)
    {
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int A[]={1,2,3,4,5,6,7,};
        int key=sc.nextInt();

        int index=LSearch(A, key);

        if(index==-1)
        {
            System.out.println("Index not found");

        }
        else{
            System.out.println("Key is found  at "+index);
        }


    }
}