/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> an = new ArrayList<>();
        preot(root,an);
        return an;
    }
    public void preot(Node root, ArrayList<Integer> an){
        if(root==null){
            return; 
        }
        an.add(root.data);
        preot(root.left,an);
        preot(root.right,an);
    }
}
