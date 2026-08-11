class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i]) > 0){
                ans.add(nums2[i]);
                hm.put(nums2[i],hm.get(nums2[i])-1);
            }
        }
        
        int[] res = new int[ans.size()];

        int i = 0;
        while (i < ans.size()) {
            res[i] = ans.get(i);
            i++;
        }
        return res;
    }
}