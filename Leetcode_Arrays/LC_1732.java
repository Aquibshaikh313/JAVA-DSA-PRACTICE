

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        //start of the altitude is  0 ;
        int[] pf = new int[n + 1]; // its given in question
        pf[0] = 0 ;
        for(int i = 1 ; i <= n ; i++){
            //prefix sum formula
            pf[i] = pf[i-1] + gain[i - 1]; 
            //fixed index and prefiix sum
        }
        
        int max = pf[0];
        for(int i = 0 ; i < pf.length; i++){
            if(pf[i] > max){
                max = pf[i];
            }
        }
        return max;
        
    }
}