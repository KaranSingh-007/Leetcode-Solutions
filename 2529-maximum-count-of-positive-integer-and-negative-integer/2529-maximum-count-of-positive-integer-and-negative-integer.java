class Solution {
    public int maximumCount(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int x = nums.length;
        while(start <= end){
            int mid = start+ (end-start)/2;
            if(nums[mid] >= 0){
                x = mid;
                end = mid - 1;
            }else start = mid + 1;
        }
        int negcount = x;
        start = 0;
        end = nums.length - 1;
        int y = nums.length;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > 0){
                y = mid;
                end = mid - 1;
            }
            else start = mid + 1; 
        }
        int poscount = nums.length - y;
        if(poscount > negcount) return poscount;
        else if (poscount < negcount ) return negcount;
        else return poscount;
    }
}