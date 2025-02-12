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
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
    public  int dfs(TreeNode x)
    {
        if(x==null)
        {
            return 0;
        }

        int l1 = 1 + dfs(x.left);
        int l2 = 1 + dfs(x.right);
        return Math.max(l1 , l2);
    }
}