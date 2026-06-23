
//find the smallest number that can be formed by rearranging the given number(digits) in an array
// Note : 0 <= arr[i] <= 9
TC:O(n) SC:O(1);
// below method is also know as "Count Sort"
import java.util.*;
public class Main {
  static int[] solve(int[] arr){
    int n = arr.length;

    int[] freq = new int[10];

    for(int i = 0 ; i < n ; i++){
      freq[arr[i]]++;
    }

    int k = 0;

    for(int i = 0 ; i < 10 ; i++){
      int count = freq[i];

      for(int j = 0 ; j < count; j++){
        arr[k] = i;
        k++;
      }
     
    }
    return arr;
  }
  public static void main(String[] args) {
     int[] arr = {0,1,1,6,3,5,4,9};
     int[] result = solve(arr);

     System.out.print(Arrays.toString(result));
  }
}

// Count Sort on Negative
import java.util.*;
public class Main {
  static int[] sortNegativeNum(int[] arr){

    int sm = arr[0];
    int larg = arr[0];
    int n = arr.length;

    for(int i = 0 ; i < n ; i++){
      if(arr[i] < sm){
        sm = arr[i];
      }
      else if(arr[i] >larg){
        larg = arr[i];
      }
    }
    
    int[] freq = new int[larg - sm + 1];
    for(int j = 0 ; j < n ; j++){
      //here we will get the index by sub smallest
      freq[arr[j] - sm]++;
    }

    int k = 0;
    for(int z = 0 ; z < freq.length; z++){
      int count = freq[z];
      for(int m = 0 ; m < count ; m++){

        //here we will get the number by adding smallest
        arr[k] = z + sm;
        k++;
      }
    }
    return arr;
  }
  public static void main(String[] args) {
      int[] arr = {-2,3,8,3,-2,1};
      int[] result = sortNegativeNum(arr);

      System.out.print(Arrays.toString(result));

  }
}

//Merge two sorted arrays


import java.util.*;
public class Main {
  static int[] mergeTwoSortedArray(int[] A,int[] B){
    int n = A.length; 
    int m = B.length;
    int[] c = new int[n+m];
    int i = 0 ; // starting with first elem/ind of A
    int j = 0 ; // starting with first elem/ind of B
    int k = 0; // starting with first elem/ind of k

    while(i < n && j < m){
      if(A[i] < B[j]){
        c[k] = A[i];
        i++;
      }else{
        c[k] = B[j];
        j++;
      }
      k++;
    }
    
    //for remaining elements
    while(i < n){
      c[k] = A[i];
      i++;
      k++;
    }
    while(j < m){
      c[k] = B[j];
      j++;
      k++;
    }

    return c;

    
  }
  public static void main(String[] args) {
      int[] A = {7,8,9,10};
      int[] B = {1,2,3};

      int[] result = mergeTwoSortedArray(A,B);

      System.out.print(Arrays.toString(result));
  }
}


//merge sort : (Bucket list pb):
Give an array of length N , sort the entire length without inbuilt method

import java.util.*;
public class Main {
  
  static int[] solve(int[] arr){
    int n = arr.length;
    mergeSort(arr,0,n-1);
    return arr;
  }
  
  static void mergeSort(int[] arr,int l , int h){
    if(l < h){
      int m = (l+h)/2;
      mergeSort(arr,l,m);
      mergeSort(arr,m+1,h);
      mergeTwoSortedArray(arr,l,m,h);
    }
  }

  static void mergeTwoSortedArray(int[] arr , int l, int m , int h){
    int[] c = new int[h-l+1];

    // i is the pointer for the first half of the array and j for second half of array
    // k is starting point of array

    int i = l; int j = m+1;
    int k = 0;

    while(i<= m && j <= h){
      if(arr[i] < arr[j]){
        c[k] = arr[i];
        i++;

      }else{
        c[k] = arr[j];
        j++;
      }
      k++;
    }

    while(i <= m){
      c[k] = arr[i];
      i++;
      k++;
    }
    while(j <= h){
      c[k]= arr[j];
      j++;
      k++;
    }

    //copy back all the elements to arr
    //we need one more var to count between l to h
    int z = 0;
    for(int p = l ; p <= h ; p++){
      arr[p] = c[z];
      z++;
    }
  }

 
  public static void main(String[] args) {
     int[] arr = {18,3,10,2,17,6,12,8,15};

     int[] result = solve(arr);

    System.out.println(Arrays.toString(result));
  }
}