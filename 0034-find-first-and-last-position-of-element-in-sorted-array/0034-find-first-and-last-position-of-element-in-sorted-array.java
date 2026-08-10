class Solution {

    int first(int[] a, int t) {
        int l = 0;
        int r = a.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (a[mid] == t) {
                ans = mid;
                r = mid - 1;
            } 
            else if (a[mid] < t) {
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }

        return ans;
    }

    int last(int[] a, int t) {
        int l = 0;
        int r = a.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (a[mid] == t) {
                ans = mid;
                l = mid + 1;
            } 
            else if (a[mid] < t) {
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), last(nums, target)};
    }
}