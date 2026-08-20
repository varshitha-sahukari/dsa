class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        int[] b = new int[n];

        int x = 0, y = 0;

        a[x++] = nums[0];
        b[y++] = nums[1];

        int i = 2;

        while (i < n) {
            if (a[x - 1] > b[y - 1])
                a[x++] = nums[i];
            else
                b[y++] = nums[i];

            i++;
        }

        int[] ans = new int[n];

        i = 0;
        while (i < x) {
            ans[i] = a[i];
            i++;
        }

        int j = 0;
        while (j < y) {
            ans[i++] = b[j++];
        }

        return ans;
    }
}