// import java.util.*;
// public class Main {



//  //***********************Calculating sum by passing array in funtion*************************
//   // public static void sum(int[] arr){
//   //   int sum = 0;
//   // //     for(int i = 0; i < 4; i++){
//   // //       sum+= arr[i]; //Another loop that goes through each element in the array and adds them to sum.
//   // //     }
//   // }
//   // // public static void main(String[] args) {
//   // //     Scanner scn = new Scanner(System.in);
//   // //     int[] arr = new int[4];
//   // //     for(int i=0;i<4;i++){ //instead of 4 we can take arr.length to take n number of inputs from user
//   // //       arr[i]=scn.nextInt(); //This loop asks the user to input 4 numbers, which are stored in the array.
//   // //     }
//   // //    
//   // //     System.out.println(sum);
//   // // }


// //******************Printing Array******************************************************************
//   //  static void printArray(int[] arr){
//   //   int n = arr.length; //size of array 
//   //    for(int i =0;i<n;i++){
//   //       System.out.println(arr[i]);
//   //     }
//   //  }

//   // public static void main(String[] args){
//   //   Scanner scn = new Scanner(System.in);
//   //     int[] arr = new int[4];
//   //     for(int i=0;i<4;i++){
//   //       arr[i]=scn.nextInt();
//   //     }
//   //     printArray(arr);
// }

// *******************Increasing each value by 1**********************************************************

//Input 5(size)
// 1 2 3 4 5 -----> Output--> 2 3 4 5 6 each element will be on next line since we are using Sopln();
// import java.util.*;
// public class Main {
//   static void incrByOne(int[] arr){
//     for(int i = 0 ; i<arr.length; i++){
//       arr[i] += 1 ;
//        System.out.println(arr[i]);
//     }
  
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);

//       int size = sc.nextInt();
//       int[] arr = new int[size];
      
//       for(int i = 0 ; i < size ; i++){
//         arr[i] = sc.nextInt();
//       }
//          incrByOne(arr);

//   }
// }


// **********************************************in increasing order from 1 to n*************************************
 
//     //arr --> 0,1,2.3,4.... n-1
//     // we want output like this--> 1,2,3,4,...n
//      public static void main(String[] args){
//     //Write a code to initialize an array
//     //in increasing order from 1 to n
   
//    //checking input 
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();

//     int arr[] = new int[n];
//     //arr --> 0,1,2,3,4.... n-1
//     // we want output like this--> 1,2,3,4,...n
//     for(int i=0;i<n;i++){
//             arr[i] = i+1;
//           }
//    //check and print the array
//    for(int i = 0;i < n;i++){
//      System.out.println(arr[i]);
//    }
//   }
// }


//*********************************************************Assignment problem************************************************
//1) Your are given an array and integer B, you have to tell wheather B is present in array A is not:
//Approach 1 
// int [] A = [ 4 1 5 9 1 ]
// int B = 5
// public class solution{
//   public int solve(int[] A, int B){ //remember one thing here one is array other is integer
//     int n = A.length;
 
//     for(int i = 0;i < n;i++){
//       if(A[i] == int B){
//         return 1;
//       }
//     }
//     return 0; // after verifying all the elements we should return 0 if the given condition is false
//   }
// }

//Approach2
import java.util.*;
public class Main {
  static void findElement(int[] arr, int B){
    for(int i = 0 ; i<arr.length; i++){
      if(arr[i] == B){
        System.out.println("Element found at index no:" + i);
      }
    }
  
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      
      int[] arr = {1,2,3,4};
      int B = 3;
      
   
        findElement(arr,B);

  }
}

//2) Reversing an array --->

// import java.util.*;

// public class Main {
//   static void revArr(int[] arr){
//     int n = arr.length;

//     Printing array elements in reverse -->
//     for(int i = n - 1; i >= 0; i--){
//       System.out.println(arr[i]);
//     }
//   }

//   public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     // int N = scn.nextInt();

//     Creating array of size 6
//     int[] arr = new int[6];

//     Read N inputs and store it in array
//     for(int i = 0; i < 6; i++){
      
//       arr[i] = scn.nextInt();
//     }

//     revArr(arr);
//   }
// }

// 3) class Main {
//     public static void main(String args[]) {
//          int[] arr = {10, 20, 30};   // Step 1: arr = [10, 20, 30]
         
//          arr = new int[3];           // Step 2: arr is now [0, 0, 0]

//          int ans = arr[0] * arr[1];  // Step 3: ans = 0 * 0 = 0

//          System.out.println(ans);   // Output: 0
//      }
// } output 0

//4)
//  class Main {
//   public static void main(String args[]) {

//     int[] arr = {10, 20, 30, 40, 50};

//     arr[3] = 95;     // valid
//     arr[4] = 60;     // valid (last index)

//     for (int i = 0; i < 5; i++) {
//       System.out.print(arr[i] + " ");
//     }
//   }
// }




