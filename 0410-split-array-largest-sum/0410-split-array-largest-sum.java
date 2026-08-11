class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0;
        int r = 0;

        int i = 0;
        while (i < nums.length) {
            l = Math.max(l, nums[i]);
            r += nums[i];
            i++;
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int cnt = 1;
            int sum = 0;
            i = 0;

            while (i < nums.length) {
                if (sum + nums[i] > mid) {
                    cnt++;
                    sum = nums[i];
                } else {
                    sum += nums[i];
                }
                i++;
            }

            if (cnt <= k) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}