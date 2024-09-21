import java.util.Comparator;
import java.util.PriorityQueue;
public class PQForObj {
    static class Student implements Comparable<Student>
    {
        String name;
        int rank;

        public Student(String name, int rank)
        {
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2)
        {
            return this.rank- s2.rank;
        }
    }

    public static void main(String args[])
    {
        PriorityQueue<Student> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("Sandesh", 1));
        pq.add(new Student("Malhar", 2));
        pq.add(new Student("Bhagawat", 3));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"="+pq.peek().rank);
            pq.remove();
            
        }
    }
}
