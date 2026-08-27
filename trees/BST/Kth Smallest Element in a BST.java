class Solution {
    public static int count;
    public static int an;
    public void inorder(TreeNode root, int k){
        if(root==null){
            return;
        }
        inorder(root.left,k);
        count++;
        if(k==count){
            an=root.val;
            return;
        }
        inorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        count=0;
        an=0;
        inorder(root,k);
        return an;
    }
}
