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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair<TreeNode, Long>> q = new LinkedList<>();
        q.offer(new Pair<>(root, 0L));

        long ans = 0;

        while (!q.isEmpty()) {
            int n = q.size();

            long st = q.peek().getValue();
            long end = st;

            while (n-- > 0) {
                Pair<TreeNode, Long> p = q.poll();

                TreeNode cur = p.getKey();
                long idx = p.getValue();

                end = idx;

                if (cur.left != null) {
                    q.offer(new Pair<>(cur.left, 2 * idx + 1));
                }

                if (cur.right != null) {
                    q.offer(new Pair<>(cur.right, 2 * idx + 2));
                }
            }

            ans = Math.max(ans, end - st + 1);
        }

        return (int) ans;
    }
}