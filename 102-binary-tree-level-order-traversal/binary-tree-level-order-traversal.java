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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        bfs(root , ans);
        return ans ;
    }
    static void bfs(TreeNode root , List<List<Integer>> ans ){
        Queue<TreeNode > q = new LinkedList<TreeNode>();
        if (root==null) return ;
        q.offer(root);
        while(!q.isEmpty()){
             int lev= q.size();
            List<Integer> list = new LinkedList<>();
            for (int i =0;i<lev;i++){
            if (q.peek().left!=null) q.offer(q.peek().left);
            if (q.peek().right!=null) q.offer(q.peek().right);
            list.add(q.poll().val);
        }
         ans.add(list);  
        }   
    }
}