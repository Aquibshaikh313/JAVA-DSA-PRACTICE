
//counting the set Bits:
public class Main {
  static int countsetBits(int N){
    int count = 0;
    for(int i = 0 ; i < 32 ; i++){
      if((N & (1<<i)) != 0){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
      int N = 12;

      System.out.print(countsetBits(N));
  }
}

//checking the bit is set or not:
public class Main {

    // Method to check if the i-th bit is set
    static boolean checkBit(int N, int i) {
        return (N & (1 << i)) != 0;
    }

    // Count number of set bits
    static int countBit(int N) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (checkBit(N, i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int N = 12; // binary: 1100
        System.out.print(countBit(N)); // Output: 2
    }
}


//A group of computer scientists is working on a project that involves encoding binary numbers.
// They need to create a binary number with a specific pattern for their project.
// The pattern requires A 0’s followed by B 1’s followed by C 0’s.
// To simplify the process, they need a function that takes A, B, and C as inputs and returns the decimal value of the resulting binary number.
// Can you help them by writing a function that can solve this problem efficiently?

// Constraints: 0 ≤ A, B, C ≤ 20

public class Main {
  static long passCode(int a, int b , int c){
    long ans = 0;
   for(int i = c ; i <= b + c - 1  ; i++){
       ans = ans | (1<<i);
   }
   return ans;

  }
  public static void main(String[] args) {
      int a = 4, b = 3,  c = 2;

      System.out.print(passCode(a,b,c));

     
  }
}

//Assignments**********
//assingment pb 1
public class Main {
  static long repeated(int[] arr){
  
    int n = arr.length;
    int ans = 0 ;
    for(int i = 0 ; i < n ; i++){
      ans =  ans ^ arr[i];
    }
    return ans;

  }
  public static void main(String[] args) {
    
    int[] arr = {1,2,2,3,1};

      System.out.print(repeated(arr));

     
  }
}

//Assigment pb 6

// You are given two integers A and B.
// Set the A-th bit and B-th bit in 0, and return output in decimal Number System.
// Note:
// The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.
public class Main {
  static long repeated(int a, int b){
    int num = (1 << a);
    if(a != b){
      num += (1<<b);
    }
    return num;

  }
  public static void main(String[] args) {
    
    int a = 3;
    int b = 5;

      System.out.print(repeated(a,b));

     
  }
} //output = 40

//assign pb 4
public class Main {
  static int checksetunset(int a, int b){
    if((a & (1 << b)) > 0 ){ //bit is set
        a = a ^(1<<b); //make it unset
    }
    return a;


  }
  public static void main(String[] args) {
    
    int a = 5;
    int b = 2;

      System.out.print(checksetunset(a,b));

     
  }
}