class Solution {

    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;
        int[] suffixMin = new int[n];

        suffixMin[n - 1] = nums[n - 1];

        int i = n - 2;

        while (i >= 0) {

            if (nums[i] < suffixMin[i + 1]) {
                suffixMin[i] = nums[i];
            } else {
                suffixMin[i] = suffixMin[i + 1];
            }

            i--;
        }
        int max = Integer.MIN_VALUE;

        i = 0;

        while (i < n) {

            if (nums[i] > max) {
                max = nums[i];
            }

            int score = max - suffixMin[i];

            if (score <= k) {
                return i;
            }

            i++;
        }

        return -1;
    }
}