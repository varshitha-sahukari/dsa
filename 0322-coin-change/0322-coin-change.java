class Solution {
    int solve(int amount,int[] coins, int[] dp){
        if(amount == 0) return 0;
        if(amount < 0) return Integer.MAX_VALUE;
        if(dp[amount] !=-1) return dp[amount];
        int minAns = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int ans = solve(amount-coins[i],coins,dp);
            if(ans != Integer.MAX_VALUE){
                ans = 1 + ans;
                minAns = Math.min(ans,minAns);
            }
        }
        return dp[amount] = minAns;
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int finalAns = solve(amount,coins,dp);
        if (finalAns == Integer.MAX_VALUE) return -1;
        return finalAns;
    }
}