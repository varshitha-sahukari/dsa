class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2)
            return s;

        int st = 0;
        int max = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd length
            int l = i, r = i;
            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {

                if (r - l + 1 > max) {
                    max = r - l + 1;
                    st = l;
                }
                l--;
                r++;
            }

            // Even length
            l = i;
            r = i + 1;

            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {

                if (r - l + 1 > max) {
                    max = r - l + 1;
                    st = l;
                }
                l--;
                r++;
            }
        }

        return s.substring(st, st + max);
    }
}