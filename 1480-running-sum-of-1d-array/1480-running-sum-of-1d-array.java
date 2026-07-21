class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int i = 0;
        int[] result = new int[n];
        result[i] = nums[i];
        for(int j = 1; j < nums.length; j++){
            result[j] = nums[j] + result[j-1];
        }
        return result;
    }
}