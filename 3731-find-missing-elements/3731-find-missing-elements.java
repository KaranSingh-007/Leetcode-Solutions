class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>ans = new ArrayList<>();
        Arrays.sort(nums);
        int value = -1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] - nums[i] != 1){
                value = (nums[i+1] - nums[i]);
                for(int j = 1; j < value; j++){
                    ans.add(nums[i]+j);
                }
            }
        }
        return ans;
    }
}