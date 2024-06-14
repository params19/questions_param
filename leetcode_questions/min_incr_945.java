import java.util.Arrays;
// TIME COMPLEXITY : nlogn
// SPACE COMPLEXITY : O(1)
class Solution {
    public int minIncrementForUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);  
        int res = 0;
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= prev) {
                res += prev + 1 - nums[i];
                prev++;
            } else {
                prev = nums[i];
            }
        }

        return res;
    }
}