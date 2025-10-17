// 1: Problem Description
// You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
// But the sum must not exceed B.
public class Solution {
    public int maxSubarray(int A, int B, int[] C) {
        int ans = 0 ;
    for(int i =0;i<A;i++){
        int sum = 0;
        for(int j =i;j<A;j++){
            sum = sum + C[j];
             if(sum<=B){
           ans = Math.max(sum,ans); 
        }
        }
    }
    return ans;
    }
}

// 2: Problem Description

// You are given an integer array A of length N.
// You have to find the sum of all subarray sums of A.
// More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
// A subarray sum denotes the sum of all the elements of that subarray.

// Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Main {
  static long subarraySum(int[] A){
    //we are taking long because of overcome overflow
    long count = 0 ;
    for(int i = 0 ; i < A.length; i++){
      long s = i + 1;
      long e = A.length - i;
      long freq = s*e; 
      count += (freq*A[i]);
    }
    return count;
  }
  public static void main(String[] args) {
     int[] A = {1,2,3};
     System.out.print(subarraySum(A));
  }
}


// 3: Problem Description

// Given an array A of length N. Also given are integers B and C.

// Return 1 if there exists a subarray with length B having sum C and 0 otherwise

public class Solution {
    public int solve(int[] A, int B, int C) {
        int sum = 0;
     for(int i =0;i<B;i++){
      sum += A[i];
     }
     if(sum==C){
         return 1;
     }
     
     for(int i = 1,j=B;i<A.length&&j<A.length;i++,j++){
       sum = sum-A[i-1]+A[j];
       if(sum==C){
           return 1;
       }
       
     }
return 0;
    }
  }

  //Maximum subarray sum of len k
  // Online Java Compiler
// Use this editor to write, compile and run your Java code online
// TC : O(N) , SC : O(1)
public class Main { 
  static long maxSumOfLenK(int[] A,int k){
    int n = A.length;
    long sum = 0 ;
   //first calculating the sum of 1st window 
   for(int i = 0 ; i < k ; i++){
    sum += A[i];
   }

   long ans = sum;
   // Go forward by one window
   int s = 1 , e = k;
   while(e < n){
    sum = sum - A[s-1] + A[e];

    ans = Math.max(ans,sum);
    s++;
    e++;
   }
   return ans;
  }
  public static void main(String[] args) {
     int[] A = {2,3,9,-1,7,1,0};
     int k = 4;
     
     System.out.print(maxSumOfLenK(A,k));
  }
}

//without using while loop in above pb
public class Main {
  static long maxSumOfLenK(int[] A,int k){
    int n = A.length;
    long sum = 0 ;
   //first calculating the sum of 1st window 
   for(int i = 0 ; i < k ; i++){
    sum += A[i];
   }

   long ans = sum;
   // Go forward by one window
   for( int i = k ; i < n ; i++){
    sum = sum - A[i-k] + A[i] ;
    ans = Math.max(ans,sum);
   }

   return ans;
  }
  public static void main(String[] args) {
     int[] A = {2,3,9,-1,7,1,0};
     int k = 4;
     
     System.out.print(maxSumOfLenK(A,k));
  }
}

//Easy level pbs based on above :
public class Main {
  static int maxSumLen2(int[] A){
    int sum = A[0] + A[1]; // first window
    int ans = sum;
    for(int i=2;i<A.length;i++){
      sum = sum - A[i-2] + A[i]; // slide window
      ans = Math.max(ans, sum);
    }
    return ans;
  }

  public static void main(String[] args){
    int[] A = {5,1,3,2,4};
    System.out.println(maxSumLen2(A)); // Output: 6
  }
}

//Calculating total sum of subarray
public class Main {
  static long totalSum(int[] A){
    int n = A.length;
    long sum = 0 ;
 
 for(int i = 0 ; i < n ; i++){
  int s = i + 1 ;
  int e = n-i;

  long freq = s * e;
  sum += (freq * A[i]); // contribution technique
 }
  

   return sum;
  }
  public static void main(String[] args) {
     int[] A = {2,5};
     
     
     System.out.print(totalSum(A));
  }
}