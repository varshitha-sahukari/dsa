class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums2.length;
        int i = n-1;
        while(i>=0){
            while(!st.isEmpty() && st.peek()<= nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                hm.put(nums2[i],-1);
            }else{
                hm.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
            i--;
        }
        int[] ans = new int[nums1.length];
        i = 0;

        while (i < nums1.length) {
            ans[i] = hm.get(nums1[i]);
            i++;
        }
        return ans;
    }
}