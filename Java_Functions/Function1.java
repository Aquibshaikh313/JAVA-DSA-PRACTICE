
//*********************************************************Printing factorial***********************************************************
// import java.util.*;
// public class Main {
//   public static void printFactorial(int n){
//     if(n < 0){
//       System.out.print("Invalid number");
//       return;
//     }
//     int factorial = 1; //if we 0 then output will be 0
//     for(int i = n; i >= 1; i--){
//       factorial = factorial * i;
//     }
//     System.out.println(factorial);
//     return;
//   }
//   public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       int n = scn.nextInt();
//       printFactorial(n);
      
//         }
// }

//*******************************************Calculating Factorial of number by nCr********************************************************

// import java.util.*;
// public class Main {

//     // Method to calculate factorial of a number
//     public static int factorial(int num) {
//         int fact = 1;
//         for (int i = num; i >= 1; i--) {
//             fact *= i;
//         }
//         return fact;
//     }

    // Method to calculate nCr
//     public static int nCr(int n, int r) {
//         if (r > n || n < 0 || r < 0) {
//             System.out.println("Invalid input");
//             return -1;
//         }

//         int num = factorial(n);
//         int denom = factorial(r) * factorial(n - r);

//         return num / denom;
//     }
// }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter value of n: ");
//         int n = sc.nextInt();

//         System.out.print("Enter value of r: ");
//         int r = sc.nextInt();

//         int result = nCr(n, r);

//         if (result != -1) {
//             System.out.println("nCr = " + result);
//         }
//     }
// }


//**************************Finding sum of two numbe with different approaches****************************
// import java.util.*;

// public class Main {

//     //approach1
//     static int sum(int a, int b) {
//         return a + b;
//     }

//     // approach2
//     static int sum2(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }

//   

//     // Method to print the product of two numbers
//     static void prodOfTwo(int a, int b) {
//         int prod = a * b;
//         System.out.println("Product: " + prod);
//     }

//     public static void main(String[] args) {

//         // Math operations
//         System.out.println("Math.pow(2, 7): " + Math.pow(2, 7));
//         // System.out.println("Math.ceil(6.7): " + Math.ceil(6.7));
//         // System.out.println("Math.floor(6.7): " + Math.floor(6.7));

//         // Function calls
//         System.out.println("Sum: " + sum(10, 20));
//         System.out.println("Sum2: " + sum2(15, 25));
//         System.out.println("Max: " + maxOfTwo(5, 6));
//         prodOfTwo(3, 4);
//     }
// }

//*****************************************************Finding maximum value of integer ********************************************************/
// import java.util.*;
// public class Main {

//    static int maxOfTwo(int a, int b){
//       int max = Math.max(a,b);
//       System.out.println(max);
//       return max;

//     }
//   public static void main(String[] args) {
   
//       Scanner sc = new Scanner(System.in);

//       int a = sc.nextInt();
//       int b = sc.nextInt();

//       maxOfTwo(a,b);
//   }
// }

//*********************************************Finding minimum of Integer*************************************************************************
// import java.util.*;
// public class Main {

//    static int minOfTwo(int a, int b){
//       int min = Math.min(a,b);
//       System.out.println(min);
//       return min;

//     }
//   public static void main(String[] args) {
   
//       Scanner sc = new Scanner(System.in);

//       int a = sc.nextInt();
//       int b = sc.nextInt();

//       minOfTwo(a,b);
//   }
// }