class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        
        int max1 = Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE;
        
        int i = k;

        while(i < nums.length) {
            

            if(max1 < nums[i-k]) {
                max1 = nums[i-k];
            }

            if(max2 < max1 + nums[i]) {
                max2 = max1 + nums[i];
            }

            i++;
        }

        return max2;
    }
}