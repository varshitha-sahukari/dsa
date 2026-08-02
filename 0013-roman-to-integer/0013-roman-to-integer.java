class Solution {

    int val(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000; // M
        }
    }

    public int romanToInt(String s) {

        int ans = 0;
        int i = 0;

        while (i < s.length()) {

            int cur = val(s.charAt(i));

            if (i < s.length() - 1 && cur < val(s.charAt(i + 1))) {
                ans -= cur;
            } else {
                ans += cur;
            }

            i++;
        }

        return ans;
    }
}