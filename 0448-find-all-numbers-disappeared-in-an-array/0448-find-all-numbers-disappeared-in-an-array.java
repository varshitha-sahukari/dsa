class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int x = Math.abs(nums[i]);
            nums[x - 1] = -Math.abs(nums[x - 1]);
            i++;
        }


        i = 0;

        while (i < nums.length) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
            i++;
        }

        return ans;
    }
}