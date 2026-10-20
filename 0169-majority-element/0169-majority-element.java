class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length;
        int mid = s + (e+s)/2;
        return nums[mid];
    }
}