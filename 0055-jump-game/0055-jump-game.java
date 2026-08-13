class Solution {
    public boolean canJump(int[] nums) {
        int maxidx = 0;
        int i =0 ;
        while(i< nums.length){
            if(i > maxidx )return false;
            maxidx = Math.max(maxidx,nums[i]+i);
            if(maxidx >= nums.length-1) return true;
            i++;
        }
        return true;
    }
}