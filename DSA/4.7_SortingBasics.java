//Given an array of n integers minimize the cost to empty given array where cost of removing an element is equal is equal to sum of all elements left in an array.

int removal(int[] arr){
  Arrays.sort(arr);
  reverse(arr);
  int n = arr.length;
  int cost = 0 ;
  for(int i = 0 ; i < n ; i++){
    cost += arr[i] * (i+1);
  }
return cost;
}

//Given an array of distinct elements find the count of noble integers
 
import java.util.*;

public class Main {
  static int nobleElem(int[] arr){
    Arrays.sort(arr);
    
    int n = arr.length;
    int ans = 0;
    for(int i = 0 ; i < n ; i++){
      if(arr[i] == i){
        ans++;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
     int[] arr = {-3,0,2,5};

     System.out.print(nobleElem(arr));
  }
}
//Given an array count the nobleInteger of it.
import java.util.Arrays; //important for arrays
public class Main {
  static int nobleIntegerIndistinct(int[] A){
   Arrays.sort(A); //NlogN
   int n = A.length;
   int ans = 0 ;
   int count_less_elem = 0 ;

   if(A[0] == 0){ //edge case
    ans++;
   }
   for(int i = 1 ; i < n ; i++){ //don't forget to start from 1 since we already take care of edge case
    if(A[i] != A[i-1]){
      count_less_elem = i;
    }
    if(count_less_elem == A[i]){
      ans++;
    }
   }
   return ans;
}
  public static void main(String[] args) {
  int[] A = {0,2,2,3,3,6};
  System.out.print(nobleIntegerIndistinct(A));
     
  }
}


//Selection sorting -->

import java.util.*;

public class Main {
  static void selectionSort(int[] arr){
    int n = arr.length;
    
    for(int i = 0 ; i < n ; i++){
      int minIndex = i;

      for(int j = i+1 ; j < n ; j++){
        if(arr[j] < arr[minIndex]){
          minIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }
  public static void main(String[] args) {
     int[] arr = {1,4,2,5,3};
     
     selectionSort(arr);
     System.out.print(Arrays.toString(arr));

  }
}

//Problem Description

// Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
//it is the same pb as that of noble differnce is greater count

public class Main {
  static int solve(int[] A){
    int n = A.length;

    for(int i = 0; i < n; i++){
      int count = 0;
      for(int j = 0; j < n; j++){
        if(A[j] > A[i]){   // count how many are greater than A[i]
          count++;
        }
      }
      if(count == A[i]){   // noble integer condition
        return 1;
      }
    }
    return -1; // no noble integer found
  }

  public static void main(String[] args) {
    int[] A = {3, 2, 1, 3};
    System.out.println(solve(A));  // Output should be 1
  }
}


