class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            totalsum += nums[i];
        }
        int leftsum = 0;
        for(int i=0;i<n;i++){
            int rightsum = totalsum - leftsum -nums[i];
            if(rightsum == leftsum) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}