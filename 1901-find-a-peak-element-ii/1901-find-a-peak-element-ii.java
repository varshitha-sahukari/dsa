class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l = 0;
        int r = mat.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int c = 0;
            int j = 1;

            while (j < mat[0].length) {
                if (mat[mid][j] > mat[mid][c]) {
                    c = j;
                }
                j++;
            }

            int up = mid > 0 ? mat[mid - 1][c] : -1;
            int down = mid < mat.length - 1 ? mat[mid + 1][c] : -1;

            if (mat[mid][c] > up && mat[mid][c] > down) {
                return new int[]{mid, c};
            }

            if (up > mat[mid][c]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}