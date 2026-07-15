class Solution {
    int solve(int i,int [] points, int[] dp){
        if(i >= points.length) return 0;
        if(dp[i] != -1) return dp[i];
        int take = points[i] + solve(i+2,points,dp);
        int dontTake = solve(i+1,points,dp);
        return dp[i] = Math.max(take,dontTake);

    }
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(nums[i],max);
        }
        int [] points = new int[max+1];
        for(int num:nums){
            points[num] +=num;
        }
        int [] dp = new int[points.length];
        Arrays.fill(dp,-1);
        return solve(0,points,dp);
    }
}