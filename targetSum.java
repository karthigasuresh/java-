class Solution {

    private int help(int[] nums, int i, int target) {

        if (i == 0) {

            if (target - nums[0] == 0 ||
                target + nums[0] == 0) {

                if (nums[0] == 0)
                    return 2;

                return 1;
            }

            return 0;
        }

        // Put + before nums[i]
        int pos = help(nums, i - 1,
                       target - nums[i]);

        // Put - before nums[i]
        int neg = help(nums, i - 1,
                       target + nums[i]);

        return pos + neg;
    }

    public int findTargetSumWays(int[] nums, int target) {

        int n = nums.length;

        return help(nums, n - 1, target);
    }
}
