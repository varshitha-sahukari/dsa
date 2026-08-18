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

    class Pair {
        TreeNode n;
        int r;
        int c;

        Pair(TreeNode n, int r, int c) {
            this.n = n;
            this.r = r;
            this.c = c;
        }
    }

    TreeMap<Integer, PriorityQueue<int[]>> mp = new TreeMap<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        dfs(root, 0, 0);

        for (PriorityQueue<int[]> pq : mp.values()) {
            List<Integer> cur = new ArrayList<>();

            while (!pq.isEmpty()) {
                cur.add(pq.poll()[1]);
            }

            ans.add(cur);
        }

        return ans;
    }

    void dfs(TreeNode root, int r, int c) {
        if (root == null)
            return;

        mp.putIfAbsent(c, new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0])
                    return a[0] - b[0];

                return a[1] - b[1];
            }
        ));

        mp.get(c).offer(new int[]{r, root.val});

        dfs(root.left, r + 1, c - 1);
        dfs(root.right, r + 1, c + 1);
    }
}