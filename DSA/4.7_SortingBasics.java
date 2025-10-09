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
 
int findNobelInt(int[] mat){
  Arrays.sort(mat); //TC : O(NlogN)
  int ans = 0 ;
  for(int i = 0 ; i < n ; i++){
    if(arr[i] == i){
      ans++;
    }
  }
} 

//Given an array count the nobleInteger of it.
import java.util.Arrays;
public class Main {
  static int nobleInteger(int[] A){
   Arrays.sort(A);
   int n = A.length;
   int ans = 0 ;
   int count_less_elem = 0 ;

   if(A[0] == 0){
    ans++;
   }
   for(int i = 1 ; i < n ; i++){
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
  System.out.print(nobleInteger(A));
     
  }
}


//Selection sorting -->

void SelectionSort(int[] arr){
  int n = arr.length;

  for(int i = 0 ; i < n ; i++){        // Step 1: go through each index
    int minIndex = i;                  // assume the current index has the smallest value
    for(int j = i+1 ; j < n ; j++){    // Step 2: check the rest of the array
      if(arr[j] < arr[minIndex]){      // if we find something smaller
        minIndex = j;                  // update minIndex
      }
    }

    // Step 3: swap the smallest found element with arr[i]
    int temp = arr[i];
    arr[i] = arr[minIndex];
    arr[minIndex] = temp;
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
