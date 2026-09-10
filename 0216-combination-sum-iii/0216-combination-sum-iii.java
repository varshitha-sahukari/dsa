import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(k, n, 1, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int k, int target, int start,
                           List<Integer> current,
                           List<List<Integer>> ans) {

        if (k == 0 && target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (k == 0 || target < 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {

            current.add(i);

            backtrack(k - 1, target - i, i + 1,
                      current, ans);

            current.remove(current.size() - 1);
        }
    }
}