class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int c = 0;
        int i = 0;
        while(i<n){
            if(nums[i]>nums[(i+1)%n]) c++;
            if(c >1) return false;
            i++;
        }
        return true;
    }

}