class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int s = 0;
        // int e = nums.length;
        // int mid = s + (e+s)/2;
        // return nums[mid];
        int currelement = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(currelement == nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                currelement = nums[i+1];
            }
        }
        return currelement;
    }
}