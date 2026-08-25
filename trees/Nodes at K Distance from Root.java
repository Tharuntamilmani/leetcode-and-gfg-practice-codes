/* Structure of Binary Tree Node 
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> kdistance(Node root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        find(root,0,k, ans);
        return ans;
    }
    public static void find(Node root,int level,int k, ArrayList<Integer> ans){
        if(root==null || k<0){
            return;
        }
        if(level==k){
            ans.add(root.data);
            return;
        }
        find(root.left,level+1,k,ans);
        find(root.right,level+1,k,ans);
    }
};
