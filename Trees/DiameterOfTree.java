public class DiameterOfTree {
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
    public static int treeHeight(Node root){
        if(root==null)
        {
            return 0;

        }
        int lh=treeHeight(root.left);
        int rh=treeHeight(root.right);

        return Math.max(lh, rh)+1;
    }
    public static int treeDiameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int ld=treeDiameter(root.left);
        int rd=treeDiameter(root.right);

        int lh=treeHeight(root.left);
        int rh=treeHeight(root.right);
        int selfd=lh+rh+1;

        return Math.max(ld,Math.max(rh,selfd));
    }
    public static void main(String args[])
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        System.out.println(treeDiameter(root));
    }
}

