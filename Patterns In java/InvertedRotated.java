public class InvertedRotated
{
    static void InvrRotHalfPy(int tr)
    {
        for(int i=1;i<=tr;i++)
        {
            for(int j=1;j<=tr-i;j++)
            {
               System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[])
    {
        InvrRotHalfPy(7);
    }
}
