class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length-1;
        int left = 0;
        int right = n;
        int idx = n;
        int[] ans = new int[n+1];
        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare > rightSquare) {
                ans[idx] = leftSquare;
                left++;
            }else{
                ans[idx] = rightSquare;
                right--;
            }    
            idx--;
        }
        return ans;
    }
}