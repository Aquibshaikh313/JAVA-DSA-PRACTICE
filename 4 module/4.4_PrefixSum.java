Given the prefix sum of an array, prefSum = [-2, 4, 1, 5, 2]
What is the sum of the original array from index 0 to 2 (0-based) ?
// Output is 1 we need to reconstruct the original array
prefSum[0] = a[0];
prefSum[1] = a[0] + a[1] ;
prefSum[2] =  a[0] + a[1] + a[2];

Step 2: Reconstruct the original array
a[0] = prefSum[0] = -2
a[1] = prefSum[1] - prefSum[0] = 4-(-2) = 6
a[2] = prefSum[2] - prefSum[1] = 1 - 4 = -3
a[3] = prefSum[3] - prefSum[2] = 5 - 1 = 4
a[4] = prefSum[4] - prefSum[3] = 2 - 5 = -3

original array comes :
a = [-2,6,-3,4,-3];
//sum of index from 0 to 2 :
a[0] + a[1] + a[2] = -2+6+(-3) = 1

// Quiz :
Given the prefix sum of an array, prefSum = [-2, 4, 1, 5, 2]
What is the sum of the original array from index 2 to 4 (0-based) ?
//output : -2


//Quiz
What is the time complexity of creating the prefix sum array of an array A of N integers ?
// Output : O(N);

//Quiz
Given the prefix sum of an array, prefSum = [-2, 4, 1, 5, 2]
What is the sum of the original array from index 1 to 2 (0-based) ?
//Output : 3

//Problem Description
// You are given an integer array A of length N.
// You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
// For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
// More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

import java.util.Arrays;
public class Main {
  static int[] rangeSum(int[] A,int[][] B){
    int n = A.length;
    int nQ = B.length;
    int[] pf = new int[n];
    pf[0] = A[0];
    for(int i = 1; i < n ; i++){
      pf[i] = pf[i-1] + A[i];
    }
 
    int[] result = new int[nQ];
    for(int i = 0 ; i < nQ ; i++){
      int L = B[i][0];
      int R = B[i][1];
          if(L == 0){
        result[i]= pf[R];
      }else{
        result[i]= pf[R] - pf[L-1];
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int[] A = {1,2,3,4,5};
    int[][] B = {{0,3},{1,2}};

    System.out.print(Arrays.toString(rangeSum(A,B)));
  }
} 
//Ouput [10,5]

// Problem Description
// You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
// Each query consists of two integers B[i][0] and B[i][1].
// For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].

TC: O(n + q);
SC : O(n);

import java.util.*;
public class Main {
  static void even(int[] arr,int[][] B){
    int n = arr.length;
    int nq = B.length;

    int[] pf = new int[n];
     pf[0] = arr[0];
    for(int i = 1 ; i < n ; i++){
      if(i%2 == 0){
        pf[i] = pf[i-1] + arr[i];
      }else{
        pf[i] = pf[i-1]; //skipping the odd elem
      }
    }

    for(int i = 0 ; i < nq ; i++){
      int L = B[i][0];
      int R = B[i][1];
      int sum = 0 ;
      
      if(L == 0){
        sum = pf[R];

      }else{
        sum = pf[R] - pf[L - 1];
      }
      System.out.print(sum + " ");
    }
    
  }
  public static void main(String[] args) {
    int[] arr = {2,3,1,6,4,5};
    int[][] B = {{1,3},{2,5},{0,5},{3,3}};

    even(arr, B);
  }
}

//same way for odd indices

import java.util.*;
public class Main {
  static void odd(int[] arr,int[][] B){
    int n = arr.length;
    int nq = B.length;

    int[] pf = new int[n];
     pf[0] = 0; // since arr[0] is even so we start with 0
    for(int i = 1 ; i < n ; i++){
      if(i % 2 == 0) {  // Changed from != to ==
         pf[i] = pf[i-1];        // SKIP even indices
          } else {
              pf[i] = pf[i-1] + arr[i]; // ADD odd indices
          }
    }

    for(int i = 0 ; i < nq ; i++){
      int L = B[i][0];
      int R = B[i][1];
      int sum = 0 ;
      
      if(L == 0){
        sum = pf[R];

      }else{
        sum = pf[R] - pf[L - 1];
      }
      System.out.print(sum + " ");
    }
    
  }
  public static void main(String[] args) {
    int[] arr = {2,3,1,6,4,5};
    int[][] B = {{1,3},{2,5},{0,5},{3,3}};

    odd(arr, B);
  }
}


//additional pb 2 on left to solve.