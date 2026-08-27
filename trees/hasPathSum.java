/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int tv) {
        if(root==null && tv==0){return false;}
        if(root==null){return false;}
        if(root.left==null && root.right==null && root.val == tv){
            return true;
        }
        return hasPathSum(root.left,tv-root.val) || hasPathSum(root.right,tv-root.val);
    }
}
