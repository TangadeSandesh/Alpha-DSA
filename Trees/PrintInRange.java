public class PrintInRange {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static Node insert(Node root, int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return null;
        }

        if(root.data>val)
        {
            root.left=insert(root.left, val);
        }
        else
        {
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void printRange(Node root, int k1, int k2)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>=k1 && root.data<=k2)
        {
            printRange(root.left, k1, k2); 
            System.out.print(root.data+" ");
            printRange(root.right, k1, k2);
        }
        else if(root.data<k1)
        {
            printRange(root.left, k1, k2);
        }
        else
        {
            printRange(root.right, k1, k2);
        }
    }
    public static void main(String args[])
    {
        int[] values={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);
        }

        printRange(root, 5,12);
    }
}
