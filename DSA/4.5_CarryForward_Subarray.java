// Given an array of length N, find subarray if the start and end is given.

public class Main {
  static int[] rangeArr(int[] arr, int B , int C){
    int s = B;
    int e = C;
    for( ; s<=e ; s++){
      System.out.print(arr[s] + ",");
    }
    return arr;
  }
  public static void main(String[] args) {
   
   int[] arr = {4,3,2,6};
   int B = 1;
   int C = 3;
   
   rangeArr(arr,B,C);
  //  System.out.print(rangeArr(arr));
  }
}

// 2 :Problem Description

// You are given an array A of N integers.
// Return a 2D array consisting of all the subarrays of the array
// Note : The order of the subarrays in the resulting 2D array does not matter.

public class Solution {
    public int[][] solve(int[] A) {
        int n = A.length;

        // total number of subarrays = n * (n + 1) / 2
        int total = n * (n + 1) / 2;
        int[][] result = new int[total][];

        int index = 0;
        // generate all subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int size = j - i + 1;
                int[] subarray = new int[size];
                for (int k = i; k <= j; k++) {
                    subarray[k - i] = A[k];
                }
                result[index++] = subarray;
            }
        }
        return result;
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {1, 2, 3};
        int[][] ans = sol.solve(A);

        // Print subarrays
        for (int[] sub : ans) {
            System.out.print("[");
            for (int i = 0; i < sub.length; i++) {
                System.out.print(sub[i]);
                if (i < sub.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}


// 3 : Problem Description

// You have given a string A having Uppercase English letters.
// You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.

public class Main {
  static long solve(String A){
    int n = A.length();
    int countG = 0;
    int countPair = 0;
    for(int i = n-1 ; i >= 0 ; i--){
      if(A.charAt(i) == 'G'){
        countG++;
      }else if(A.charAt(i) == 'A'){
        countPair += countG;
      }
    }
    return countPair;
  }
  public static void main(String[] args) {
    //  String A = "ABCGAG" ; //output = 3;
     String A = "GAB"; // output = 0

     System.out.print(solve(A));
  }
}

// finding length of smallest subarray containing min and max

public class Main {
    static int minSubarrayLen(int[] A, int n){
        int min = A[0];
        int max = A[0];

        // find min and max
        for(int i = 1 ; i < n ; i++){
            if(A[i] > max){
                max = A[i];
            } else if(A[i] < min){
                min = A[i];
            }
        }

        int minIndex = -1;
        int maxIndex = -1;
        int ans = Integer.MAX_VALUE;

        // second pass
        for(int i = 0 ; i < n ; i++){
            if(A[i] == min){
                minIndex = i ;
                if(maxIndex != -1){
                    ans = Math.min(ans, Math.abs(maxIndex - minIndex) + 1);
                }
            }

            if(A[i] == max){
                maxIndex = i;
                if(minIndex != -1){
                    ans = Math.min(ans, Math.abs(maxIndex - minIndex) + 1);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,1,3,4,6,4,6,1};
        int n = A.length;

        System.out.print(minSubarrayLen(A,n));
    }
}
