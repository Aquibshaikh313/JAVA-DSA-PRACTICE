


public class Main {
  static long pow(int a, int n){
    if(n==0){return 1;}
    long t = pow(a,n/2);
    if(n%2 == 0){
      return t * t;
    }
    return t * t * a;
  }
  public static void main(String[] args) {
    int a = 2 ;
    int n = 2;   

    System.out.print(pow(a,n));
  }
}

//printing array of index using recursion


public class Main {
  static void printArr(int[] arr, int idx){
    if(idx == arr.length){
      return;
    }
    System.out.print(arr[idx] + " ");
    printArr(arr,idx+1);
  
  }
  public static void main(String[] args) {
   int[] arr = {1,2,3,4,5};
   int idx = 0;

   printArr(arr,idx);
  }
}


// calculating the sum of array


public class Main {
  static int sumOfArr(int[] arr, int idx){

     // means when we are at last index we just need to return the particulr index we dont need to go further
    if(idx == arr.length - 1){
      return arr[idx];
    }
    return arr[idx] + sumOfArr(arr,idx+1);
  
  }
  public static void main(String[] args) {
   int[] arr = {1,2,3,4,5};
   int idx = 0;

   System.out.print(sumOfArr(arr,idx));
  }
}

// Call	What happens	Returned value
sumOfArr(arr, 4)	base case → return arr[4] = 5	
sumOfArr(arr, 3)	returns arr[3] + 5 = 4 + 5 =	9
sumOfArr(arr, 2)	returns 3 + 9	= 12
sumOfArr(arr, 1)	returns 2 + 12	= 14
sumOfArr(arr, 0)	returns 1 + 14 =	15

✅ Final output → 15


// checking out palindrome

public class Main {
  static boolean isPalind(char[] str, int l, int r){

   if(l > r){return true;}
   if(str[l] == str[r] && isPalind(str,l+1,r-1)){
    return true;
   }
   return false;
  }
  public static void main(String[] args) {
   char[] str = {'r','a','d','a','r'};
   

  System.out.println(isPalind(str, 0, str.length - 1));
  }
}


| Step | l | r | str[l] | str[r] | Comparison | What happens                   |
| ---- | - | - | ------ | ------ | ---------- | ------------------------------ |
| 1    | 0 | 4 | 'r'    | 'r'    | match ✅    | call isPalind(str, 1, 3)       |
| 2    | 1 | 3 | 'a'    | 'a'    | match ✅    | call isPalind(str, 2, 2)       |
| 3    | 2 | 2 | 'd'    | 'd'    | l == r ✅   | **base case → return true**    |
| 4    | — | — | —      | —      | —          | All previous calls return true |


//finding Bth index in an array
import java.util.Arrays;
public class Main {
  static int[] recurr(int[] A, int B,int idx,int count){
    if(idx == A.length){
      return new int[count];
    }
    if(A[idx] == B){
      int[] ans = recurr(A,B,idx+1,count+1);
      ans[count] = idx;
      return ans;
    }
    else{
      
      return recurr(A,B,idx+1,count);
    }

  }
  public static void main(String[] args) {

    int[] A ={1,2,3,1,1};
    int B = 1;
    int[] result = recurr(A,B,0,0);

    System.out.print(Arrays.toString(result));
      
  }
}


//Tower of hanoi pb


public class Main {
  static void TOH(int n , int A, int B, int C){
    //parameters
    //n = number of disks to Move
    // A -> source tower
    // B => helper tower
    // C -> destination tower.
    //GOal is to move n disc from A to C using B as helper.
    if(n > 0){
      // since we are moving one disc at a time therefore n-1
      TOH(n-1,A,C,B);
      //now since we moved smaller disc out of the way
      // we can move larget disc 1 -> 3
      System.out.printf("Move a Disc from %d to %d\n", A, C);
      //after that we move smaller disc back on top of it
      TOH(n-1,B,A,C);
    }
  }
  public static void main(String[] args) {
    int n = 3;//number of disc
    TOH(n,1,2,3);
      
  }
}