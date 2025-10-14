

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length; 
        int sum = 0 ;
        for(int s = 0 ; s < n ; s++){
            for(int e = s ; e < n ; e++){
                if((e-s+1)%2 == 1 ){ //odd length
                    for(int i = s ; i <=e ; i++){
                        sum += arr[i];
                    }
                }
            }
        }
        return sum;
    }
}