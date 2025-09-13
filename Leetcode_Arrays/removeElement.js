// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int k = 0;
//         int n = nums.length;
//         for (int i = 0 ; i < n ; i++){
//             if(nums[i]!= val){
//                 nums[k] = nums[i];
//                 k++;
//             }
//         }
//         return k;
        
//     }
// }