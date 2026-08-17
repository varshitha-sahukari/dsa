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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            int x = 0;
            while(n-- >0){
                TreeNode cur = q.poll();
                x = cur.val;
                if(cur.left != null){
                    q.offer(cur.left);
                }if(cur.right != null){
                    q.offer(cur.right);
                }
            }
            ans.add(x);
        }
        return ans;
    }
}