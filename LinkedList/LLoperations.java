public class LLoperations {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
        static Node head;
        
        void addFirst(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                return;
            }
            else{
                newNode.next=head;
                head=newNode;
            }
        }
        static boolean isCycle()
        {
            Node slow=head;
            Node fast=head;

            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast)
                {
                    return true;
                }

            }
            return false;
        }

       
     public static void main(String args[])
        {
            //LLoperations ll=new LLoperations();
            // ll.addFirst(10);
            // ll.addFirst(20);
            // ll.addFirst(30);

            Node head=new Node(1);
            head.next=new Node(3);
            head.next.next=new Node(4);
            head.next.next.next=head;


            System.out.println(isCycle());
        }
}
