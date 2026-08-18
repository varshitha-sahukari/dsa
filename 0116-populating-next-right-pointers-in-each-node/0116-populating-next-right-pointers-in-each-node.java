/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node cur = root;

        while (cur.left != null) {
            Node x = cur;

            while (x != null) {
                x.left.next = x.right;

                if (x.next != null)
                    x.right.next = x.next.left;

                x = x.next;
            }

            cur = cur.left;
        }

        return root;
    }
}