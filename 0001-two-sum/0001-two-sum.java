// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i=0; i < nums.length; i++){
//             int num = nums[i];
//             int rem = target - num;
//             if(map.containsKey(rem)){
//                 return new int[]{i, map.get(rem)};
//             }
//             map.put(num,i);
//             }
//         return new int[]{};
//     }
// }

// // how this one is on top 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[j]+nums[j-i]==target)return new int[]{j-i,j};
            }
        }
        return new int[]{};
        
    }
}