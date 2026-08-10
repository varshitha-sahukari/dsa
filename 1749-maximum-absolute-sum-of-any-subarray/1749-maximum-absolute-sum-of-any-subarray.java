class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0;
        int min = 0;
        int ans = 0;

        int i=0;
        while(i<nums.length){
            max = Math.max(0,max+nums[i]);
            min = Math.min(0,min+nums[i]);
            
            ans = Math.max(ans , Math.max(max , -min));
            i++;
        }
        return ans;
    }
}