class Solution {
    public long countCommas(long n) {

        long ans = 0;

        long power = 1000;
        long commas = 1;

        while (power <= n) {

            long end = Math.min(n, power * 1000 - 1);

            long count = end - power + 1;

            ans += count * commas;

            power *= 1000;
            commas++;
        }

        return ans;
    }
}