class NumArray {
     int[] pf; //so that both functions can access
    public NumArray(int[] nums) {
       int n = nums.length;
       pf = new int[n]; //used class varible
       pf[0] = nums[0];
       for(int i = 1; i < n ; i++){
        pf[i] = pf[i-1] + nums[i];
       }
    }
    
    public int sumRange(int left, int right) {
        
        int sum = 0 ;
        if(left == 0){
            sum = pf[right];
        }else{
            sum = pf[right] - pf[left - 1];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */