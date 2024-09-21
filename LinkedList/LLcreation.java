class LLcreation
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
    Node head;
    Node tail;

    void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
     void add(int idx, int data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
    }
    void remove(int idx)
    {
        Node temp=head;
        Node ptr=temp.next;
        int i=0;

        while(i<idx-1)
        {
            temp.next=ptr;
            ptr=ptr.next;
            i++;
        }

        temp.next=ptr.next;
        //ptr.next=null;

    }
    int  iterativeSearch(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp.next=temp;
            i++;
        }
        return -1;
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
        

        System.out.println("Size of the LL="+count);

    }
   
    public static void main(String args[])
    {
        LLcreation ll=new LLcreation();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(50);
        ll.addLast(60);
        
        ll.add(2,100);
        ll.remove(2);
        ll.printLL();

        int key=10;
        System.out.println(ll.iterativeSearch(key));
    }
}