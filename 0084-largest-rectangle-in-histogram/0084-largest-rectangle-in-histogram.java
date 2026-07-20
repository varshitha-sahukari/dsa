class Solution {
    public int[] previousSmaller(int[] heights){
        Stack<Integer> st = new Stack<>();
        int n= heights.length;
        int [] prev = new int [n];
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            prev[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return prev;
    }
    public int[] nextSmaller(int[] heights){
        int n = heights.length;
        int [] next = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            next[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return next;
    }
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int[] prev = previousSmaller(heights);
        int[] next = nextSmaller(heights);
        for(int i= 0;i<heights.length;i++){
            int width = next[i]-prev[i]-1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}