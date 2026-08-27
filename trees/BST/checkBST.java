class Solution {
    public boolean check(Node root, int min,int ma){
        if(root==null){
            return true;
        }
        if(root.data<min || root.data>ma){
            return false;
        }
        return check(root.left,min,root.data-1) && check(root.right,root.data+1,ma);
        
    }
    public boolean isBST(Node root) {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
