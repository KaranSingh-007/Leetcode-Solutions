class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 1;
        int i = 0;
        int j = 1;
        while(j<nums.length){
            if(nums[i] != nums[j]){
                unique = unique+1;
                i++;
                nums[i] = nums[j];
            }
            j++;
            
        }
        return unique;
    }
}