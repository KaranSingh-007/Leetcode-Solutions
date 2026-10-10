class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int currentelement = nums[i];
            if(count == 0){
                candidate = currentelement;
            }
            if(candidate == currentelement){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}