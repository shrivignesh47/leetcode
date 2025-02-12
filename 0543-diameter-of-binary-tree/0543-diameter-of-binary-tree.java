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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter(root);
        return max;
    }
    public int maxDiameter(TreeNode root)
    {
        if(root==null) return 0;
        int left=maxDiameter(root.left);
        int right=maxDiameter(root.right);
        max =  Math.max(left+right , max);
        return  Math.max(left , right) + 1;
    }
}