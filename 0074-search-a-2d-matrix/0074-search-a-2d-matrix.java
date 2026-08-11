class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int rows = m.length;
        int cols = m[0].length;

        int l = 0;
        int r = rows * cols - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (m[row][col] == t) {
                return true;
            } else if (m[row][col] < t) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }
}