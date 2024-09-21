import java.util.LinkedList;

class LLMergeSort
{

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
        
     Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        //find mid
        Node mid=getMid(head);

        //Left and right mergeSort
        Node righthead=mid.next;
        mid.next=null;

        Node newleft=mergeSort(head);
        Node newright=mergeSort(righthead);

        //Merge
        return merge(newleft,newright);
    }
    static Node getMid(Node head)
    {
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;  //Mid Node
    }
     static Node merge(Node head1, Node head2)
    {
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while(head1!=null && head2!=null)
        {
            if(head1.data<=head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }

        }
        while(head1!=null)
        {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null)
        {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
       }
       return mergedLL.next;
    } 
    void printLL()
    {
        Node temp=head;
        int count=0;
        if(head==null)
        {
            System.out.print("LinkedList is empty.");
            return;
        }

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
            count++;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        LLMergeSort ll=new LLMergeSort();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);


        System.out.println(ll); 

        ll.head=ll.mergeSort(ll.head);
        ll.printLL();
    }
}