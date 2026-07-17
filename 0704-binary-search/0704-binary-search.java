class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        if (start == end && target == nums[start]) return 0;
        if (start == end && target != nums[start]) return -1;
        while(start<=end){
            int mid = (start+end)/2;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
}