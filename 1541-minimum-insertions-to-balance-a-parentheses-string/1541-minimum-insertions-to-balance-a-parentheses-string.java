class Solution {
public int minInsertions(String s) {
int ans = 0, need = 0;

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        if (c == '(') {
            if (need % 2 == 1) {
                ans++;
                need--;
            }
            need += 2;
        } else {
            need--;

            if (need < 0) {
                ans++;
                need = 1;
            }
        }
    }
    return ans + need;
    }
}