/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> an = new ArrayList<>();
        inot(root,an);
        return an;
    }
    public void inot(Node root, ArrayList<Integer> an){
        if(root==null){
            return; 
        }
        inot(root.left,an);
        an.add(root.data);
        inot(root.right,an);
    }
    
}
