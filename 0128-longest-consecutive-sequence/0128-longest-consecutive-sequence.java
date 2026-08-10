class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i =0;
        while(i<nums.length){
            set.add(nums[i]);
            i++;
        }
        int ans = 0;
        for(int x : set){
            if(!set.contains(x-1)){
                int y = x;
                int length = 1;
                while(set.contains(y+1)){
                    y++;
                    length++;
                }
                ans = Math.max(length,ans);
            }

        }
        return ans;
    }
}