import java.util.*;

class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        String cur = "";

        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(cur);
                cur = "";
            } 
            else if (c == ')') {
                cur = new StringBuilder(cur).reverse().toString();
                cur = st.pop() + cur;
            } 
            else {
                cur += c;
            }

            i++;
        }

        return cur;
    }
}