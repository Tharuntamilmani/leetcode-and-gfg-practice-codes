/* Structure of a Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public static int count;
    public static int an;
    public void inorder(Node root, int k){
        if(root==null){
            return;
        }
        inorder(root.right,k);
        count++;
        if(k==count){
            an=root.data;
            return;
        }
        inorder(root.left,k);
    }
    public int kthLargest(Node root, int k) {
        count=0;
        an=0;
        inorder(root,k);
        return an;
    }
}
