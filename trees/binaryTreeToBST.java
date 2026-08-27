/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class Solution {
    public static int i;
    Node binaryTreeToBST(Node root) {
        i=0;
        ArrayList<Integer>num=new ArrayList<>();
        inorder(num,root);
        Collections.sort(num);
        inordermodify(num,root);
        return root;
    }
    public void inorder(ArrayList<Integer> num, Node root){
        if(root==null){
            return;
        }
        inorder(num,root.left);
        num.add(root.data);
        inorder(num,root.right);
    }
    public void inordermodify(ArrayList<Integer> num, Node root){
        if(root==null){
            return;
        }
        inordermodify(num,root.left);
        root.data=num.get(i++);
        inordermodify(num,root.right);
    }    
}
