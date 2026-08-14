class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long ans = 0;
        Stack<Integer> st = new Stack<>();

        int[] l = new int[n];
        int[] r = new int[n];

        int i = 0;
        while(i < n) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            l[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
            i++;
        }

        st.clear();

        i = n - 1;
        while(i >= 0) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            r[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
            i--;
        }

        i = 0;
        while(i < n) {
            long lc = i - l[i];
            long rc = r[i] - i;

            ans += arr[i] * lc * rc;
            i++;
        }

        return (int)(ans % 1000000007);
    }
}