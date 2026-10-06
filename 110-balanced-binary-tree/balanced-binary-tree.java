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
    public boolean isBalanced(TreeNode root) {
        if (dfs(root)==-1)return false;
        return true;
    }
    static int dfs(TreeNode root){
        if (root==null)return 0;
        int leftheight = dfs(root.left);
        int rightheight= dfs(root.right);
        if (leftheight==-1)return -1;
        if (rightheight==-1)return -1;

        if(Math.abs(rightheight-leftheight)>1)return-1;
        return 1+Math.max(leftheight  , rightheight);

    }
}