//Problem 53 -->
//kadane algo
class Solution {
    public int maxSubArray(int[] nums) {
      int n = nums.length;
      int sum = nums[0] ;
      int max = nums[0];

      for(int i = 1 ; i < n ; i++){
        sum = Math.max(nums[i], sum + nums[i]);
        max = Math.max(sum,max);
        
      }
      return max;
    }
}