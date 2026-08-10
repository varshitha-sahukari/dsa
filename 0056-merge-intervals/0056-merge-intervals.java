class Solution {
    public int[][] merge(int[][] a) {
        Arrays.sort(a, (x, y) -> x[0] - y[0]);

        ArrayList<int[]> r = new ArrayList<>();

        int i = 0;

        while (i < a.length) {
            int s = a[i][0];
            int e = a[i][1];

            while (i + 1 < a.length && a[i + 1][0] <= e) {
                e = Math.max(e, a[i + 1][1]);
                i++;
            }

            r.add(new int[]{s, e});
            i++;
        }

        return r.toArray(new int[r.size()][]);
    }
}