class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        while (i<nums.length-2) {
            if (nums[i] > 0)
                break;
            if (i>0 && nums[i]== nums[i-1]) {
                i++;
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int s = nums[i] + nums[l] + nums[r];
                if (s == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    while (l < r && nums[l] == nums[l + 1])
                        l++;

                    while (l < r && nums[r] == nums[r - 1])
                        r--;

                    l++;
                    r--;
                }
                else if (s < 0) {
                    l++;
                }
                else {
                    r--;
                }
            }

            i++;
        }

        return ans;
    }
}    