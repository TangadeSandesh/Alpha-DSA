import java.util.Stack;

public class NextGreater {
    public static void main(String args[])
    {
        int[] A={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int[] nxtGreater=new int[A.length];

        for(int i=A.length-1; i>=0; i-- )
        {
            while(!s.isEmpty() && A[s.peek()]<=A[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nxtGreater[i]=-1;
            }
            else{
                nxtGreater[i]=A[s.peek()];
            }

            s.push(i);
        }
        for(int i=0; i<nxtGreater.length;i++)
        {
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}
