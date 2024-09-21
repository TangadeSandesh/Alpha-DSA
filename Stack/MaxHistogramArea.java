import java.util.Stack;

public class MaxHistogramArea {
    public static void main(String args[])
    {
        int[] ht={2,4};
        Stack<Integer> s=new Stack<>();
        int[] nsr=new int[ht.length];
        int[] nsl=new int[ht.length];
        int maxArea=0;

        //next right smaller
        for(int i=ht.length-1; i>=0; i-- )
        {
            while(!s.isEmpty() && ht[s.peek()]>=ht[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i]=ht.length;
            }
            else{
                nsr[i]=ht[s.peek()];
            }

            s.push(i);
        }

        //next left smaller
        s=new Stack<>();
        for(int i=0;i<ht.length; i++ )
        {
            while(!s.isEmpty() && ht[s.peek()]>=ht[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i]=-1;
            }
            else{
                nsl[i]=ht[s.peek()];
            }

            s.push(i);
        }

        for(int i=0; i<ht.length; i++)
        {
            int heigth=ht[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=heigth*width;
            maxArea=Math.max(maxArea,currArea);
        }

        System.out.println(maxArea);
    }
}
