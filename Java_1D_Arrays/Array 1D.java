
// ***************************Shfting index by One*****************
//Right shift

// public class Main {
//   static int[] rightShift(int[] arr){
//     int n = arr.length;
//     int lastElement = arr[n-1];
//     for(int i = n-2 ;i>=0 ;i--){
//       arr[i+1] = arr[i];
//     }
//     arr[0] = lastElement;
//     return arr;
//   }
//   public static void main(String[] args) {
//     int[] arr = {1, 2, 3, 4, 5};

//     int[] result = rightShift(arr);
//    System.out.print(Arrays.toString(result));
      
//   }
// }

import java.util.*;
public class Main {
  static int[] leftShift(int[] arr){
    int n = arr.length;
    int a = arr[0];
   
    for(int i = 1 ; i<n  ;i++){
      arr[i - 1] = arr[i];
    }
   arr[n-1] = a;
    return arr;
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    int[] result = leftShift(arr);
   System.out.print(Arrays.toString(result));
      
  }
}
//**************************Same method using void****************************
import java.util.*;

public class Main {
    static void shiftByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        // No return statement here
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        shiftByOne(arr); // just call the method, no return value
        System.out.println(Arrays.toString(arr)); // print the modified array
    }
}


//**************************frequency of Element********************

// public class Main {
//   static int frequencyOfK(int[] arr, int k){
//     int n = arr.length;
//     int count = 0 ;
//     for(int i = 0 ; i < n; i++){
//       if(arr[i] == k){
//         count ++;
//       }
//     }
//     return count;
//   }
//   public static void main(String[] args) {
//      int[] arr = { 1,2,3,4,5,4};
//      int k = 4;

//      System.out.println(frequencyOfK(arr,k));

//   }
// }

//**********************Swapping values******************

// public class Main {
//   static int[] swap(int a, int b){
//  int temp = b;
//   a = b; 
//   b = temp;
//   return new int[] {a,b};
   
//   }
//   public static void main(String[] args) {
//      int a = 3;
//      int b = 4;
   

//     System.out.println("a = " + a);
//     System.out.println("b = " + b);
    


//   }
// }

// ***********************ArrayList Methods for 1D arrays****************************
// import java.util.*;
// public class Main {
//   public static void main(String[] args) {
//       ArrayList<Integer> al = new ArrayList<>();
//       al.add(1); //[1]
//       al.add(2);//[1,2]
//       al.add(3);//[1,2,3]
//       al.add(4);//[1,2,3,4]
//       al.add(5);//[1,2,3,4,5]
//       al.add(6);//[1,2,3,4,5,6]
//       al.add(7);//[1,2,3,4,5,6,7]
//       al.remove(2); //[1,2,4,5,6,7]
//       al.get(0); //1
//       al.set(1,30);//[1,30,4,5,6,7]
//       Collections.sort(al);
//       // System.out.println(al);//[1,4,5,6,7,30]
//       System.out.println(al.size());//6
      
//         }
// }

//***********************Increasing each value by One**************************
// import java.util.*;
// public class Main {
//   static void increaseByOne(ArrayList<Integer> al){
//    int n = al.size();
//    for(int i = 0 ; i< n ; i++){
//     al.set(i, al.get(i)+1);
//    }
//   }
//   public static void main(String[] args) {
//     ArrayList<Integer> al = new ArrayList<>();
//       al.add(1); //[1]
//       al.add(2);//[1,2]
//       al.add(3);//[1,2,3]
//       al.add(4);//[1,2,3,4]
//       al.add(5);//[1,2,3,4,5]
//       al.add(6);//[1,2,3,4,5,6]
//       al.add(7);//[1,2,3,4,5,6,7]
//       al.remove(2); //[1,2,4,5,6,7]
//       al.get(0); //1
//       al.set(1,30);//[1,30,4,5,6,7]
//       Collections.sort(al);
//       System.out.println(al);//[1,4,5,6,7,30]
//       // System.out.println(al.size());//6
//       increaseByOne(al);
//       System.out.println(al);
//   }
// }

// *******************Printing Even numbers using ArrayList************************
// import java.util.*;
// public class Main {
//   static ArrayList<Integer> evenNumber(ArrayList<Integer> al){ // this is function remember that
//     ArrayList<Integer> evenNums = new ArrayList<Integer>();
//    int n = al.size();
//  
//    for(int i = 0 ; i< n ; i++){
 //     int output = al.get(i);
//      if(output % 2==0){
//       evenNums.add(output);

//     }
//    }
//    return evenNums;
//   }
//   public static void main(String[] args) {
//     ArrayList<Integer> al = new ArrayList<>();
//       al.add(1); //[1]
//       al.add(2);//[1,2]
//       al.add(3);//[1,2,3]
//       al.add(4);//[1,2,3,4]
//       al.add(5);//[1,2,3,4,5]
//       al.add(6);//[1,2,3,4,5,6]
//       al.add(7);//[1,2,3,4,5,6,7]
//       al.remove(2); //[1,2,4,5,6,7]
//       Collections.sort(al);
//       System.out.println(al);
//       System.out.println(evenNumber(al));
      
//   }
// }

//****************************************************Printing Odd Numbers**********************************************************

// import java.util.*;
// public class Main {
//   static ArrayList<Integer> oddNumber(ArrayList<Integer> al){
//     ArrayList<Integer> oddNums = new ArrayList<>();
//     int n = al.size();
//     for(int i = 0 ; i < n ; i++){
//        int num = al.get(i);
//       if(num %2 != 0){
//         oddNums.add(num);
//       }
//     }
//     return oddNums;
//   }
//   public static void main(String[] args) {
//     ArrayList<Integer> al = new ArrayList<>();
//       al.add(1); //[1]
//       al.add(2);//[1,2]
//       al.add(3);//[1,2,3]
//       al.add(4);//[1,2,3,4]
//       al.add(5);//[1,2,3,4,5]
//       al.add(6);//[1,2,3,4,5,6]
//       al.add(7);//[1,2,3,4,5,6,7]
//       al.remove(2); //[1,2,4,5,6,7]
//       Collections.sort(al);
//       System.out.println(al);
//       System.out.println(oddNumber(al));
      
//   }
// }


//***********************************ArrayList More examples to practise --------------------------------------------------------->

// 1) ******************Remove all Odd Numbers********************
// import java.util.*;
// public class Main {
//   static ArrayList<Integer> oddNumber(ArrayList<Integer> al){
//     ArrayList<Integer> oddNums = new ArrayList<Integer>();
//    int n = al.size();
//   //  int output = 
//    for(int i = 0 ; i< n ; i++){
//     if(al.get(i)% 2!=0){
//       oddNums.add(al.get(i));

//     }
//    }
//    return oddNums;
//   }
//   public static void main(String[] args) {
//     ArrayList<Integer> al = new ArrayList<>();
//       al.add(1); //[1]
//       al.add(2);//[1,2]
//       al.add(3);//[1,2,3]
//       al.add(4);//[1,2,3,4]
//       al.add(5);//[1,2,3,4,5]
//       al.add(6);//[1,2,3,4,5,6]
//       al.add(7);//[1,2,3,4,5,6,7]
//       al.remove(2); //[1,2,4,5,6,7]
//       Collections.sort(al);
//       System.out.println(al);
//       System.out.println(oddNumber(al));
      
    
//   }
// }

// 2) ***************Sum of all the input number****************
// import java.util.*;
// public class Main {
//   static int sumOfNumber(ArrayList<Integer> al){
//     // ArrayList<Integer> sum = new ArrayList <Integer>();
//    int sum = 0;
//     int n = al.size();
//     for(int i = 0 ; i < n ; i++){
//      sum = sum + al.get(i);

//     }
//     return sum;
   
//   }
//   public static void main(String[] args) {

//       ArrayList<Integer> al = new ArrayList<>();
//       al.add(1);
//       al.add(2);
//       al.add(3);
//       al.add(4);
//       al.add(5);
//       al.add(6);
//       al.add(7);
      
//       System.out.println(al);
//       System.out.println(sumOfNumber(al));
//   }
// }

// 3) *******************Reversing an ArrayList*****************************
// import java.util.*;
// public class Main {
  
 
// static ArrayList<Integer> revArrayList(ArrayList<Integer> al){
//   ArrayList<Integer> rev = new ArrayList<>();
//   int n = al.size();
//   for(int i = n-1 ; i >=0 ; i--){
//     rev.add(al.get(i));
//   }
//   return rev;


//   }
//   public static void main(String[] args) {
    

//       ArrayList<Integer> al = new ArrayList<>();
//       al.add(1);
//       al.add(2);
//       al.add(3);
//       al.add(4);
//       al.add(5);
//       al.add(6);
//       al.add(7);
      
//       System.out.println(al);
//       System.out.println(revArrayList(al));
//   }
// }

// More to be practised-->
// Find Maximum and Minimum Elements
// Check if List is Palindrome
// Merge Two ArrayLists
// Find Duplicate Elements
// Print Elements at Even Index
// Count Frequency of Each Element
// Remove Duplicates from ArrayList


//Removing Duplicates*******************************************
import java.util.*;
public class Main {
  static ArrayList<Integer> uniqNumbers(ArrayList<Integer> al){
    ArrayList<Integer> uniqNums = new ArrayList<>();
    int n = al.size();
    
    for(int i = 0 ; i < n ; i++){
      int count = 0 ;
     for(int j = 0 ; j < n ; j++){
      if(al.get(i) ==(al.get(j))){
        count++;
      }
     }
     if(count == 1){
      uniqNums.add(al.get(i));
     }
    }
    return uniqNums;
  }
  
  public static void main(String[] args) {

      ArrayList<Integer> al = new ArrayList<>();
      al.add(1);
      al.add(1);
      al.add(3);
      al.add(4);
      al.add(5);
      al.add(6);
      al.add(7);
      
      System.out.println(al);
      System.out.println(uniqNumbers(al));
  }
}

//**********************************************Scaler Assignment Problems**************************
// 1) You are given an integer array A and an integer B.
// You are required to return the count of pairs having sum equal to B.
// NOTE: pair (i,j) and (j,i) are same.

// import java.util.*;
// public class Main {
//  static int countPair(int[] A, int B){
//   int count = 0 ;
//   for(int i = 0 ; i < A.length ; i++){
//     for(int j = i+1 ; j < A.length ; j++){
//       if(A[i]+ A[j] == B){
//         count++;
//       }
//     }

//   }
//   return count;

//   }
//   public static void main(String[] args) {
    
//     int[] A = {1,2,3,2,1};
//     int B = 5;
    
    
//     System.out.println(countPair(A, B));
//   }
// } output 2

// 2) checking if the array is sorted or not 
// import java.util.*;
// public class Main {
//    static boolean sortedArr(int[] A){
//     int n = A.length;
//     int count = 0 ;
//       for(int i = 0 ; i < n - 1; i++){ //n-1 bcz since we are doing A[i+1] it will go beyond n and will give us error
       
//         if(A[i] > A[i+1]){
//         return false;
//         }
//       }
//       return true;
//   }
//   public static void main(String[] args) {
    
//      int[] A = {1,2,3,4};
//      System.out.println(sortedArr(A));
//   }
// } //true

// 3)Given an array A of N integers. 
// Count the number of elements that have at least 1 elements greater than itself.
// import java.util.*;
// public class Main {
//    static int greaterCount(int[] A){
//     int n = A.length;
//     int count = 0 ;
//       for(int i = 0 ; i < n-1; i++){
       
//         if(A[i] > A[i+1]){
//         count ++ ;
//         }
//       }
//       return count;
//   }
//   public static void main(String[] args) {
    
//      int[] A = {5,5,1}; // if the input is {1,2,4,4,5} //output will be 4 becoz 4,4 are two different elements even if they are same
   
//      System.out.println(greaterCount(A));
//   }
// }//output for given input --> 1