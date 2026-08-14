class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i = nums2.length-1;
        while(i>=0){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
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
        int [] ans = new int[nums1.length];
        for(int j=0;j<nums1.length;j++){
            ans[j] = hm.get(nums1[j]);
        }
        return ans;
    }
}