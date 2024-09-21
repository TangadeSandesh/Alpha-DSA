import java.util.PriorityQueue;

class BuildPriorityQueue
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(1);
        pq.add(4);
        pq.add(2);
        pq.add(0);

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}