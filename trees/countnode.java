class node{
    int data;
    node left;
    node right;
    public node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class countnodes {
    public static int countAllNodes(node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countAllNodes(root.left) + countAllNodes(root.right);
    }
    public static void main(String[] args) {
        node root = new node(3);
        root.left = new node(2);
        root.left.left=new node(4);
        root.left.right=new node(8);
        root.left.right.left=new node(5);
        root.left.right.right=new node(6);

        root.right = new node(1);
        root.right.left=new node(9);
        root.right.right=new node(10);
        root.right.right.right=new node(0);
        System.out.println("Tree successfully constructed with no errors!");
    }
}
