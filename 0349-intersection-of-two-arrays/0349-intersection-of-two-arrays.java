class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for(int nums:nums1){
            hs.add(nums);
        }
        for(int nums : nums2){
            if(hs.contains(nums)){
                ans.add(nums);
            }
        }
        int[] arr = new int[ans.size()];
        int i=0;
        for(int num:ans){
            arr[i++]=num;
        }
        return arr;
    }
}