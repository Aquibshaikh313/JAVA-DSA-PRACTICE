//Problem 643

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double avgSum = 0; 

        //calculating the first window:
        for(int i = 0 ; i < k ; i++){
            avgSum += nums[i];
        }
        double ans = avgSum ;
        //Go forward for next window
        for(int i = k ; i < n ; i++){
            avgSum = avgSum - nums[i-k] + nums[i];
            ans = Math.max(ans,avgSum);
            
        }
        return ans/k;
    }
}