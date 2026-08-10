class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        int i =0;
        while(i<nums.length){
            if(nums[i]==1 ){
                count = count +1;
                max = Math.max(max ,count);

            }else{
                count = 0;
            }
            i++;
        }
        return max;
    }
}