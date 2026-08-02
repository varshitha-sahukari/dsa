class Solution {
    public String removeOuterParentheses(String s) {
        Stack <Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray() ){
            if(c == '('){
                if(!stack.isEmpty()){
                    sb.append(c);
                }
                stack.push(c);
            }
            if(c == ')'){
                stack.pop();
                if(!stack.isEmpty()){
                    sb.append(c);
                }
            }

        }
        String ans = sb.toString();
        return ans;

    }
}