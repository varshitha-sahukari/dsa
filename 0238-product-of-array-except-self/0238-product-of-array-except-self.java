class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int p = 1;

        int i = 0;
        while (i < n) {
            ans[i] = p;
            p *= nums[i];
            i++;
        }

        p = 1;
        i = n - 1;

        while (i >= 0) {
            ans[i] *= p;
            p *= nums[i];
            i--;
        }

        return ans;
    }
}