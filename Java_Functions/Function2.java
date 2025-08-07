//****************************************Finding area of circle********************************************************
// import java.lang;
// public class Main {
//   public static void test2() {
  // static double areaofcirle(int R){
  //  double area = Math.PI * R * R ;

  //  return area;

  // }
//   System.out.println("Hi");
//   return ;

// }
//   public static void main(String[] args) {
    // Scanner scn = new Scanner(System.in);
    // int radius = scn.nextInt();

    // double area = areaofcirle(radius);
    // System.out.print(area);
//     test2();
//     System.out.println("hello");
      
//   }
// }

// //*******************Boolean way to return true of even and false for odd******************************
// public class Main {
// public static boolean isEven(int N){
//   if(N%2==0){
//     return true ;
//   }else{
//     return false;
//   }
 
// }
// public static void main(String[] args){
//   System.out.println(isEven(60));
//   System.out.println("Hello");
// }
// }

// ******************Even and odd******************************
// public class Main {
//   public static void EvenOdd(int N){
//     if(N%2 == 0){
//       System.out.println("Even");
//       return;
//     }
//     System.out.println("odd");

// }   public static void main(String [] args){
//     EvenOdd(10);
//     System.out.println("hello");
//    }
// }

//*********************************************************Quiz********************************************************
public class Main{
  public static int check(int N){ // 3) see here its int ,if it was void it would have worked
    System.out.print(N + 10);// 1) it will become 25 here but 
    //2) in next line no return statement even that would have work if data type was void 
  }
  public static void main(String[] args){
     check(15);
    
  }
}

//*********************************************************Quiz********************************************************
import java.util.*;
public class Main {
  //how the quiz was
  // public static int even(int n){
  //   if(n % 2 == 0)
  //   {
  //     return 2;
  //   }
  // }
  // public static void main(String[] args) {
  //   int a = even(10);
  //   System.out.print(a);
     
  // } //there will be error bcz no else statement for odd

  // 2) how i improve it to make it correct>
  // public static int even(int n){
  //   if(n % 2 == 0)
  //   {
  //     return 0;
  //   }else{
  //     return 1 ;
  //   }
  // }
  // public static void main(String[] args) {
  //   int a = even(10);
  //   System.out.print(a);
     
  // }

  // 3) if want to print ans as even or odd then just add data type String
  
  // public static String even(int n){
  //   if(n%2 ==0){
  //     return "even";
  //   }else{
  //     return "odd";
  //   }

  // }
  // public static void main(String[] args){
  //   String a = even(10);
  //   System.out.println(a);
  // }

// 4) if want to make it true or false just replace it by boolean
  // public static boolean even(int n){
  //   if(n%2 == 0){
  //     return true ;
  //   }
  //   else{
  //     return false;
  //   }
    
  // }
  // public static void main(String[] args){
  //   boolean a = even(10);
  //   System.out.print(a);
  // }


//*********************************************************Perfect Square Find********************************************************
//   public static boolean isPerfectSquare(int N){
//     for(int i=1; i*i<=N ; i++){
//       if(i*i == N){
//         return true;
//       }
 
//     }
//     return false;// only return false after checking all i values
//   }
//   public static void main (String[] args){
//     Scanner scn = new Scanner(System.in);
//     int N = scn.nextInt();
//     System.out.print(isPerfectSquare(N));
//   }
// }

//********************************calucating sum of factors****************************************
//factors of 8 --> 1,2,4,8 so the sum will be 15
// static int sumOfFactorial(int N){
//   int ans = 0;
//   for(int i=1;i<=N;i++){ //i=1 bcz N%i will be error cant divide by 0
//     if(N%i == 0){
//        ans+=i;
//     }
//   }
//   return ans;

// }
//   public static void main(String [] args){
//     Scanner scn = new Scanner(System.in);
//     int N = scn.nextInt();
//     System.out.println(sumOfFactorial(N));
//   }

//********************************Quiz****************************************
// public static int sum(int a, int b){
//   return a + b; //after return statement nothing should be there so it will show error
//   System.out.print("Hello");
// }


// public static void main(String[] args){
//   int x = 10; int y = 20;
//   System.out.println(sum(x,y));
// }
// }

// ************************************Assignments: problems based on funcitons 2************************************************
// 1) Print even and odd numbers >>
// import java.util.*;
// public class Main {
//   public static String evenOdd(int N){
//     if(A%2 == 0){
//       return "Even";

//     }else{
//       return "Odd";
//     }
//   }


//   public static void main(String[] args){
//     Scanner scn = new Scanner(System.in);
//     int N = scn.nextInt();
//     System.out.print(evenOdd(N));
//   }
// }

// 2) You are given a function that takes an integer argument A. Return 1 if A is a perfect square otherwise return 0.

// A perfect square is an integer that is the square of an integer. For example 16 is perfect square as it is the square of an integer 4 (42 = 16)
// import java.util.*;
// public class Main {
//   public static int perfSquare(int N){
//     for(int i=1;i*i<=N;i++){
//       if(i*i == N){
//         return 1;
//       }
//     } 
//     return 0;
    
//   }
//   public static void main(String[] args){
//     Scanner scn = new Scanner(System.in);
//     int N = scn.nextInt();

//     System.out.println(perfSquare(N));
    
   
//   }
// }

// 3)You are given an integer A, you need to find and return the sum of all the even numbers between 1 and A.
// import java.util.*;
// public class Main {
//   public static int evenNums(int N){
//     int ans = 0;
//     for (int i = 2; i<=N; i+=2){
//       if(i%2 == 0){
//         ans +=i;
//       }

//     }
//     return ans;
    
//   }
//   public static void main(String[] args){
//     Scanner scn = new Scanner(System.in);
//     int N = scn.nextInt();
//     System.out.print(evenNums(N));    
      
//   }
// }

// ******************4) You are given two integers A and B. You have to find the value of A^B.**********************************

// import java.util.*;
// public class Main {
//   public static int power(int A, int B){
//     int result = (int)Math.pow(A,B);Math.pow returns double therefore we typecast into int by using (int) before it

//     return result;

//   }
//   public static void main(String[] args){
//     Scanner scn = new Scanner(System.in);
//     int A = scn.nextInt();
//     int B = scn.nextInt();

//     System.out.println(power(A,B));

//   }
// }

// 5)You are given a positive integer A denoting the radius of a sphere. You have to calculate the volume of the sphere.
// Volume of a sphere having radius R is given by (4 * π * R3) / 3.

// import java.util.*;
// public class Main {
//   public static int volOfSphere(int R){
//    double result = 4*Math.PI*Math.pow(R,3)/3;
//    int C = (int)Math.ceil(result);   // typecasting from double to int
      
// return C;
   
//   }
//   public static void main(String[] args){
//     Scanner scn = new Scanner(System.in);
//     int R = scn.nextInt();

//     System.out.println(volOfSphere(R));

   
//   }
// }

//6) one exaample im trying for vol of cylinder i.e pie r^2 h;
// import java.util.*;
// public class Main {
//   public static int volOfCyl(int R,int h){
//    double d = Math.PI*R*R*h;
//    int c = (int)Math.ceil(d); //this step i.e (int) we are typecasting from double to int

      
// return c;
   
//   }
//   public static void main(String[] args){
//     Scanner scn = new Scanner(System.in);
//     int R = scn.nextInt();
//     int h = scn.nextInt();

//     System.out.println(volOfCyl(R,h));

   
//   }
// }

// 7) mcq output will be none not error bcz we are not printing anything here?
// class Main {

//    static int smaller(int a,int b) {
//        if(a < b) {
//            return a;
//        }
//        else {
//            return b;
//        }
//    }


//    public static void main(String args[]) {
//        int a = 20,b = 45;
//        smaller(a,b);
//       //  System.out.println(smaller(a,b));

//    }

// }

// 8) Calculating sum of digits i.e for example input is 7896 output will be 4
//Below are two approaches to do it
//Approach 1 converting into string
// import java.util.*;
// public class Main {
//  static int numOfDigits(int N){
//   String str = Integer.toString(N);
//   return str.length();
// }
//   public static void main(String [] args){
//     Scanner scn = new Scanner(System.in);
//     int N = scn.nextInt();
//     int result = numOfDigits(N);
//     System.out.println(result);
  
//   }

// }

//Approach2
// import java.util.*;

// public class Main {
//     static int numOfDigits(int N) {
//         if (N == 0) return 1;  // Special case for 0

//         int count = 0;

//         // Using for loop to divide N by 10 until it becomes 0
//         for (; N != 0; N = N / 10) {
//             count++;
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int N = scn.nextInt();
//         int result = numOfDigits(N);
//         System.out.println(result);
//     }
// }
