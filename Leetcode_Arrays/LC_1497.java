class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        int n = arr.length;

        //count the remainders
        for(int i = 0 ; i < n; i++){
            int rem = ((arr[i] % k) + k ) % k; //handling negative numbers
            freq[rem]++;

        }

        //Step 2: check pairs
        if(freq[0] % 2 != 0){ return false;}

        for (int i = 1; i < k; i++) {
            if (freq[i] != freq[k - i]) {
                return false;
            }
        }
        
        return true;
    }
}


For each element num:

Compute its remainder rem = num % k

To make a valid pair, we need another number whose remainder is (k - rem) % k

Example with k = 6:


| num | rem | required pair rem |
| --- | --- | ----------------- |
| 9   | 3   | 3                 |
| 7   | 1   | 5                 |
| 5   | 5   | 1                 |
| 3   | 3   | 3                 |



Step 2: Frequency logic

We’ll use a frequency array (or map) to count how many numbers have each remainder.

Conditions for a valid pairing:

For remainder 0: must have an even count.

For any r: freq[r] == freq[k - r].



//Dry run

| num | rem | freq[rem]   |
| --- | --- | ----------- |
| 9   | 3   | freq[3] = 1 |
| 7   | 1   | freq[1] = 1 |
| 5   | 5   | freq[5] = 1 |
| 3   | 3   | freq[3] = 2 |
