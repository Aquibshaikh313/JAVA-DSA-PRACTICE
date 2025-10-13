class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int maj = - 1; 
        int count = 0 ;
        
        //moore's voting algo
        for(int i = 0 ; i < nums.length; i++){
            if( count == 0){
                maj =  nums[i];
                count++;
            }else if(nums[i] == maj){
                count++;
            }else{
                count--;
            }
        }
        return maj;
        
    }
}