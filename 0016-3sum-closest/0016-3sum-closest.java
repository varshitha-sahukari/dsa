import java.util.Arrays;

class Solution {
public int threeSumClosest(int[] nums, int target) {
Arrays.sort(nums);
    int n = nums.length;
    int closest = nums[0] + nums[1] + nums[2];

    int i = 0;

    while (i < n - 2) {
        int l = i + 1;
        int r = n - 1;

        while (l < r) {
            int sum = nums[i] + nums[l] + nums[r];

            if (Math.abs(target - sum) < Math.abs(target - closest)) {
                closest = sum;
            }

            if (sum == target) {
                return sum;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        i++;
    }

    return closest;
}
}
