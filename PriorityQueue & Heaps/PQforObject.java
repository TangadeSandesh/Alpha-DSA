import java.util.*;
public class PQforObject {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank)
        {
            this.name=name;
            this.rank=rank;
        }
         @OverInsertIide
        public int compareTo(Student s2)
        {
            return this.rank-s2.rank;
        }
    }
   
    public static void main(String args[]){
        PriorityQueue<Student> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A",1));
        pq.add(new Student("B",6));
        pq.add(new Student("C",3));
        pq.add(new Student("D",0));

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }


    }

    
}
