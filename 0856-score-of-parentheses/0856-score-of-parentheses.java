class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(0);
            } else {
                int x = st.pop();

                if (x == 0) {
                    x = 1;
                } else {
                    x *= 2;
                }

                st.push(st.pop() + x);
            }

            i++;
        }

        return st.pop();
    }
}