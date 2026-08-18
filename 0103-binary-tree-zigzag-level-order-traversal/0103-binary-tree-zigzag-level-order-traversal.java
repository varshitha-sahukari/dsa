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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean rev = false;

        while (!q.isEmpty()) {
            int n = q.size();
            LinkedList<Integer> cur = new LinkedList<>();

            while (n-- > 0) {
                TreeNode x = q.poll();

                if (!rev)
                    cur.addLast(x.val);
                else
                    cur.addFirst(x.val);

                if (x.left != null) q.offer(x.left);
                if (x.right != null) q.offer(x.right);
            }

            ans.add(cur);
            rev = !rev;
        }

        return ans;
    }
}