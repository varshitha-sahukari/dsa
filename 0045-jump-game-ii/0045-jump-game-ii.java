class Solution {
    public int jump(int[] nums) {
        int l = 0;
        int r = 0;
        int jumps = 0;

        while (r < nums.length - 1) {
            int far = 0;

            int i = l;

            while (i <= r) {
                far = Math.max(far, i + nums[i]);
                i++;
            }

            l = r + 1;
            r = far;
            jumps++;
        }

        return jumps;
    }
}