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
    public boolean checkvalue(TreeNode first,TreeNode second){
 if(first==null && second==null)
        return true;
       if( first==null || second==null || first.val!=second.val)
        return false;
 return checkvalue(first.right,second.right) && checkvalue(first.left,second.left);

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
       return checkvalue(p,q);
    }
}
