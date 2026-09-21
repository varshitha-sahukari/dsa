class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] ans = new long[k];
        long[] dp = new long[k];
        int i = 0;
        while (i < nums.length) {
            long[] ndp = new long[k];
            int x = nums[i] % k;
            int r = 0;
            while (r < k) {
                int nr = (r * x) % k;
                ndp[nr] += dp[r];
                r++;
            }
            ndp[x]++;
            r = 0;
            while (r < k) {
                ans[r] += ndp[r];
                r++;
            }
            dp = ndp;
            i++;
        }
        return ans;
    }
}