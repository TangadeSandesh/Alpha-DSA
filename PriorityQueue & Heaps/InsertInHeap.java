import java.util.*;
public class InsertInHeap {
    static class Heap
    {
        ArrayList<Integer> list=new ArrayList<>();
        
        public void add(int data)
        {
            list.add(data);
            
            int ci=list.size()-1;
            int pi=(ci-1)/2;

            while(list.get(ci) < list.get(pi))
            {
                //swap
                int temp=list.get(ci);
                list.set(ci,list.get(pi));
                list.set(pi,temp);

                ci=pi;
                pi=(ci-1)/2;
            }
        }
        public int peek()
        {
            return list.get(0);
        }
        public void heapify(int i)
        {
            int left=2*i+1;;
            int right=2*i+2;
            int minIndx=i;

            if(list.size()>left && list.get(minIndx)>list.get(left))
            {
                minIndx=left;
            }
            if(list.size()>right && list.get(minIndx)>list.get(right))
            {
                minIndx=right;
            }
            if(minIndx!=i)
            {
                int temp=list.get(i);
                list.set(i,list.get(minIndx));
                list.set(list.size()-1, temp);

                heapify(minIndx);

            }
        }
        public int remove()
        {

            int data=list.get(0);

            //step-1 swap first & last
            int temp=list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);

            //step-2 remove last
            list.remove(list.size()-1);

            //step-3 heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty()
        {
            return list.size()==0;
        }

         public static void main(String args[])
        {
            Heap h=new Heap();
            h.add(3);
            h.add(4);
            h.add(1);
            h.add(5);

            while(!h.isEmpty())
            {
                System.out.println(h.peek());
                h.remove();
            }
        }
    }      
}

