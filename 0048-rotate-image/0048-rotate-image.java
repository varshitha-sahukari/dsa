class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;


        int i = 0;

        while (i < n) {
            int j = i + 1;

            while (j < n) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;

                j++;
            }

            i++;
        }

        // Reverse every row
        i = 0;

        while (i < n) {
            int l = 0;
            int r = n - 1;

            while (l < r) {
                int t = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = t;

                l++;
                r--;
            }

            i++;
        }
    }
}