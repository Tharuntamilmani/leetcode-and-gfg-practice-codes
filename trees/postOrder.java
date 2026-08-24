/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> an = new ArrayList<>();
        postot(root,an);
        return an;
    }
    public void postot(Node root, ArrayList<Integer> an){
        if(root==null){
            return; 
        }
        postot(root.left,an);
        postot(root.right,an);
        an.add(root.data);
    }
}
