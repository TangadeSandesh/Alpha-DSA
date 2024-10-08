import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueu {
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(1);
        pq.add(2);
        pq.add(3);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
