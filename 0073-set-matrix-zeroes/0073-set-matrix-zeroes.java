class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        boolean fr = false;
        boolean fc = false;

        int i = 0;

        while (i < c) {
            if (matrix[0][i] == 0) {
                fr = true;
            }
            i++;
        }

        i = 0;

        while (i < r) {
            if (matrix[i][0] == 0) {
                fc = true;
            }
            i++;
        }

        i = 1;

        while (i < r) {
            int j = 1;

            while (j < c) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
                j++;
            }

            i++;
        }

        i = 1;

        while (i < r) {
            if (matrix[i][0] == 0) {
                int j = 1;

                while (j < c) {
                    matrix[i][j] = 0;
                    j++;
                }
            }
            i++;
        }

        int j = 1;

        while (j < c) {
            if (matrix[0][j] == 0) {
                i = 1;

                while (i < r) {
                    matrix[i][j] = 0;
                    i++;
                }
            }
            j++;
        }

        if (fr) {
            j = 0;

            while (j < c) {
                matrix[0][j] = 0;
                j++;
            }
        }

        if (fc) {
            i = 0;

            while (i < r) {
                matrix[i][0] = 0;
                i++;
            }
        }
    }
}