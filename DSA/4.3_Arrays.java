// 1:  Problem Description :
// Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.

public class GoodPairChecker {
    public static boolean goodPairExists(int[] A, int B) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] + A[j] == B ) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int B = 5;
        System.out.println(goodPairExists(arr, B)); // true (2+3)
    }
}

// 2: Problem Description
// Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].


import java.util.Arrays;
public class Main {
  static void revArr(int[] arr , int start , int end){
    int i = start;
    int j = end ;
    while (i < j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;

    }
  }
  public static void main(String[] args) {
      int[] arr = {1,2,3,4};
      int start = 2;
      int end = 3;

      revArr(arr,start,end);
      System.out.println(Arrays.toString(arr));
  }
}  //output : [1, 2, 4, 3]


// 3: Problem Description

// Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.

import java.util.Arrays;

public class Main {
    static void revArr(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void solve(int[] arr, int B) {
        int N = arr.length;
        B = B % N; // handle edge cases (B > N)

        // Step 1: reverse whole array
        revArr(arr, 0, N - 1);

        // Step 2: reverse first B elements
        revArr(arr, 0, B - 1);

        // Step 3: reverse remaining N-B elements
        revArr(arr, B, N - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int B = 2;

        solve(arr, B);
        System.out.println(Arrays.toString(arr));
        // Output: [3, 4, 1, 2]
    }
}

// 4: Problem Description

// Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.

import java.util.Arrays;
public class Main {
 static int minMaxSum(int[] arr){
  int min = arr[0];
  int max = arr[0];
  for(int i = 0 ; i < arr.length; i++){
    if(arr[i] > max){
      max = arr[i];
    }if(arr[i] < min){
      min = arr[i];
    }
  }
  return min + max ;
 }
  
 
  public static void main(String[] args) {
     int[] arr =  {-2, 1, -4, 5, 3};
            
     int result = minMaxSum(arr);
     System.out.println(result);
     
  }
}

What is the time complexity for inserting/deleting at the beginning of the array?
//O(N) since it is 1D array it has N length 
//if it was 2D array it would have rows and cols 
// i.e N*N --> O(N^2)

//Additional assignments starts ---------------->
// 1: Problem Description

// Given an array A and an integer B, find the number of occurrences of B in A.

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Main {
  static int sum(int[] A , int B){
    int count = 0;
    for(int i = 0 ; i < A.length ; i++){
      if(A[i] == B){
        count++;
      }   
   }
   return count;
  }
  public static void main(String[] args) {
     int [] A = { 1,2,2,3,2,4};
     int B = 2;

     System.out.print(sum(A,B));
  }
} 
// Output : 3

// 2: Problem Description

// Given an integer array A of size N. In one second, you can increase the value of one element by 1.
// Find the minimum time in seconds to make all elements of the array equal.

public class Main {
 static int solve(int[] A){
  int max = A[0];
  for(int i = 0 ; i < A.length; i++){
    if(A[i]> max){
      max = A[i];
    }
  }
   int sum = 0 ;
  for(int i = 0 ; i < A.length; i++){
    sum += max - A[i];
  }
  return sum;
 }
 
  public static void main(String[] args) {
     int[] A = {2,4,1,3,2};
     

     System.out.print(solve(A) + " seconds");
  }
} // output : 8 seconds


// 3: What will be the output of the following code?

// class Main {
//    static void fun(int[] arr) {
//        arr[3] = 98;
//        return;
//    }

//    public static void main(String args[]) {
//        int[] arr = {10,20,30,40,50};
//        fun(arr);
//        System.out.println(arr[3]);
//    }
// }
// Output : 98


// 4: Problem Description

// Given an array A of N integers. 
// Count the number of elements that have at least 1 elements greater than itself.

public class Main {
   static int countGreatElem(int[] A){
    int max = A[0];
    for(int i = 0 ; i < A.length ; i++){
      if(A[i] > max ){
        max = A[i];
      }
    }

    int count = 0 ;
    for(int i = 1 ; i < A.length; i++){
      if(max > A[i]){
        count++;
      }
    }
    return count ;
   }

  public static void main(String[] args) {
    int[] A = {3,2,1};

    System.out.print(countGreatElem(A));
  }
}

// 5: Problem Description

// You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.

import java.util.Arrays;

public class Main {
    static int secondLargElem(int[] A) {
        Arrays.sort(A); // sort in ascending order
        int n = A.length;
        
        // Start from the second last element and find the first smaller than max
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] != A[n - 1]) {
                return A[i];  // ✅ return the actual second largest
            }
        }
        return -1; // if all elements are equal, no second largest exists
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 2}; // expected output: 1
        // int[] A = {2};    // expected output: -1

        System.out.println(secondLargElem(A));
    }
}

//more efficient way of solving the above pb
public class Main {
    static int secondLargElem(int[] A) {
        if (A.length < 2) return -1; // not enough elements

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : A) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] A1 = {2, 1, 2};      // → 1
        int[] A2 = {2};            // → -1
        int[] A3 = {5, 5, 5};      // → -1
        int[] A4 = {7, 3, 9, 5};   // → 7

        System.out.println(secondLargElem(A1));
        System.out.println(secondLargElem(A2));
        System.out.println(secondLargElem(A3));
        System.out.println(secondLargElem(A4));
    }
}


