class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int x = nums[i];

            if (x >= 1 && x <= n && nums[x - 1] != x) {
                int t = nums[i];
                nums[i] = nums[x - 1];
                nums[x - 1] = t;
            } else {
                i++;
            }
        }

        i = 0;

        while (i < n) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
            i++;
        }

        return n + 1;
    }
}