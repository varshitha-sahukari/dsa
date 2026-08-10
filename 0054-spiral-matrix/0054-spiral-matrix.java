class Solution {
    public List<Integer> spiralOrder(int[][] a) {

        List<Integer> ans = new ArrayList<>();

        int t = 0;
        int b = a.length - 1;
        int l = 0;
        int r = a[0].length - 1;

        while (t <= b && l <= r) {

            // left → right
            int j = l;

            while (j <= r) {
                ans.add(a[t][j]);
                j++;
            }
            t++;

            // top → bottom
            int i = t;

            while (i <= b) {
                ans.add(a[i][r]);
                i++;
            }
            r--;

            // right → left
            if (t <= b) {
                j = r;

                while (j >= l) {
                    ans.add(a[b][j]);
                    j--;
                }
                b--;
            }

            // bottom → top
            if (l <= r) {
                i = b;

                while (i >= t) {
                    ans.add(a[i][l]);
                    i--;
                }
                l++;
            }
        }

        return ans;
    }
}