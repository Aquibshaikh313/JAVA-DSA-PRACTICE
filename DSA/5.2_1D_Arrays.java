//kadane's Algorithm --> 

public class Main {
  static int maxSum(int[] arr){
    int ans = arr[0], sum = arr[0] ;
    int n = arr.length;
    //for negative numbers
    //  for(int i  = 1 ; i < n ; i++){
    //    if(arr[i] < 0){
    //     sum += arr[i];
    //     ans = Math.min(ans,sum);
    //   }
    //  }
    for(int i = 1 ; i < n ; i++){
     
      // if(sum < 0){
      //   sum = 0 ;
      // }
      
      sum = Math.max(arr[i] , sum + arr[i]);
      ans = Math.max(ans,sum);
     
    }

    return ans;
  
  }

  public static void main(String[] args) {
    int[] arr = {-2, -3, -4, -1, -5, -10, -7};

  System.out.print(  maxSum(arr));
  }
}


//2nd Problem
// Perform multiple queries frm i to last index:
// Given an integer array A where every element is 0, return the final array after performing multiple queries.
//TC: O(n + Q) & SC:O(1)

import java.util.Arrays;
public class Main {
  static int[] solve(int[] A, int[][] Q){
     
      for(int i = 0  ; i < Q.length; i++){
          int index = Q[i][0]; //left
          int value = Q[i][1]; //right
          A[index] += value;
      }

        for(int i = 1 ; i < A.length ; i++){
          A[i] = A[i-1] + A[i];
        }

        return A;
  }

  public static void main(String[] args) {
      int[] A = {0,0,0,0,0,0,0};

      int[][] Q = {{1,3},{4,2},{3,1}};
      
      int[] result = solve(A,Q);
      
      System.out.print(Arrays.toString(result));
      

  }
}


// 3rd Problem -->Perform multiple queries from index i to j
// Given an integer array A every element is 0, return the final array after performing multiple queries.
// Query(i,j,x). Add x to all the numbers from index i to j
//A[7] = {0,0,0,0,0,0,0}
      i  j  x
Query(1, 3, 2)
Query(4, 5, 3)
Query(3, 6, -1)

//output {0,2,2,1,2,2,-1};

import java.util.Arrays;
public class Main {
  static int[] solve(int[] arr,int[][] Q){
     for(int i = 0  ; i < Q.length; i++){
        int s = Q[i][0];
        int e = Q[i][1];
        int v = Q[i][2];

        arr[s] += v;
        
        //that e+1 will cross the bound therefore settin the condtion
        if(e+1 < arr.length){
          arr[e+1] -=v;
      }

     }

     for(int i = 1 ; i < arr.length ; i++){
      arr[i] = arr[i-1] + arr[i];
     }

     return arr;
  }

  public static void main(String[] args) {
      int[] arr = {0,0,0,0,0,0,0};


        int[][] Q = {
          {1, 3, 2},
          {4, 5, 3},
          {3, 6, -1}
      };


        int[] result = solve(arr, Q);
        System.out.println(Arrays.toString(result));
      
         }
}


//assignment pb 3
import java.util.Arrays;
public class Main {
  static int[] solve(int[] arr,int[][] Q){
     for(int i = 0  ; i < Q.length; i++){
        int s = Q[i][0];
        int e = Q[i][1];
        int v = Q[i][2];

        arr[s-1] += v;
        
        //that e+1 will cross the bound therefore settin the condtion
        if(e-1 < arr.length-1){
          arr[e+1-1] -= v;
      }

     }

     for(int i = 1 ; i < arr.length ; i++){
      arr[i] = arr[i-1] + arr[i];
     }

     return arr;
  }

  public static void main(String[] args) {
      int[] arr = {0,0,0,0,0};


        int[][] Q = {
          {1, 2, 10},
          {2, 3, 20},
          {2, 5, 25}
      };


        int[] result = solve(arr, Q);
        System.out.println(Arrays.toString(result));
      
         }
}
