import java.util.*;
public class Main {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

      //we need to run N-rows and M-columns
      int N = scn.nextInt();
      int M = scn.nextInt();

      // create 2-D array 
      int[][] mat = new int[N][M];

      //Read 2-D array elements 
      for(int i = 0 ; i < N ; i++){
        //for every N-row we need to read M-columns 
        //(0,0), (0,1), (0,2) ,(0,3).....(0,M-1)
        for(int j = 0 ; j < M ; j++){
          mat[i][j] =  scn.nextInt();
        }
      }
  }
}

//Dry Run for creating input -->
// i = 0    j = 0       1         2           3
//         (0,0)=1   (0,1)=2   (0,2)=3     (0,3)=4

// i = 1   (1,0)=5   (1,1)=6   (1,2)=7     (1,3)=8

// i = 2   (2,0)=9   (2,1)=10   (2,2)=11     (2,3)=12

//print (0,1) -->


//***************printing row zero********************
import java.util.*;
public class Main {
  static void printRowZero(int [][] mat){
    int col = mat[0].length;
     for(int c = 0 ; c < col ; c++){
       System.out.print(mat [0][c] + " ");
      }
  }
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

      //Taking N-rows and M-columns from user
      int N = scn.nextInt();
      int M = scn.nextInt();
     

      // create 2-D array 
      int [][] mat = new int[N][M];

      // taking Input elements
        System.out.println("Enter elements row-wise:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

      printRowZero(mat);
      

      
     
  }
} 
// input
// 3 4
// 1 2 3 4 
// 5 6 7 8 
// 9 10 11 12

//output -->
// Enter elements row-wise:
// 1 2 3 4

//Printing all rows***********************
import java.util.*;
public class Main {
  static void printAllRows(int [][] mat){
    int row = mat.length;
    int col = mat[0].length;
    for(int r = 0 ; r < row ; r++){
       for(int c = 0 ; c < col ; c++){
       System.out.print(mat [r][c] + " ");
      }
       System.out.println();
    }
   
  }
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

      //1)Take number of rows and columns
      int N = scn.nextInt();
      int M = scn.nextInt();
     

      // 2)Create 2-D array 
      int [][] mat = new int[N][M];

      //3) Taking Input row-wise  elements
        System.out.println("Enter elements row-wise:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

      printAllRows(mat);
      

      
     
  }
} 
// input 3 4
// output: 
// Enter elements row-wise:
// 1 2 3 4 
// 5 6 7 8 
// 9 10 11 12 

//Printing in Wave form -->
import java.util.*;
public class Main {
  static void printWaveForm(int[][] mat){
    int rows = mat.length ;
    int cols = mat[0].length;

    for(int r = 0 ; r < rows ; r++){ //left to right
      if(r%2== 0){
        for(int c = 0 ; c < cols ; c++){
        System.out.print(mat[r][c] + " ");
      }

      
      }else{//right to left
      for(int c = cols-1 ; c >= 0 ; c--){
        System.out.print(mat[r][c] + " ");
      }

      }
      System.out.println();
      
    }
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    
    //Taking N-rows and M-columns 
     int N = sc.nextInt();
     int M = sc.nextInt();

    //creating 2-D array 
    int[][] mat = new int[N][M]; //if we failed to write N,M it will throw error like missing dimension

    //reading values for row-wise 
    for(int i = 0 ;i < N ; i++){
      for(int j = 0 ; j< M ; j++){
        mat[i][j] = sc.nextInt();
      }
    }

    printWaveForm(mat);


  }
}
 //input :
// 4 4
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16

// output
// 1 2 3 4 
// 8 7 6 5 
// 9 10 11 12 
// 16 15 14 13 

//printing zero column 
import java.util.*;
public class Main {
  static void printZeroCol(int[][] mat){
    int rows = mat.length ;  
    // int cols = mat[0].length;
    for(int r = 0; r < rows ; r++){
      System.out.print(mat[r][0] + " ");
    }
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     //taking input N-rows and M columns 
     int N = sc.nextInt();
     int M = sc.nextInt();

     //taking 2-D array 
     int[][] mat = new int[N][M];

     //reading values 
     for(int i = 0 ; i < N ; i++){
      for(int j = 0 ; j < M ; j++){
        mat[i][j] = sc.nextInt();
      }
     }
     printZeroCol(mat);
  }
}

//**************************Printing all columns************************************
import java.util.*;
public class Main {
  static void printAllCols(int[][] mat){
    int rows = mat.length ;  
    int cols = mat[0].length;
   for(int c = 0 ; c < cols ; c++){
     for(int r = 0; r < rows ; r++){
      System.out.print(mat[r][c] + " ");
    }
    System.out.println();
   }
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     //taking input N-rows and M columns 
     int N = sc.nextInt();
     int M = sc.nextInt();

     //taking 2-D array 
     int[][] mat = new int[N][M];

     //reading values 
     for(int i = 0 ; i < N ; i++){
      for(int j = 0 ; j < M ; j++){
        mat[i][j] = sc.nextInt();
      }
     }
     printAllCols(mat);
  }
}


//Printing waving format for cols : -->
import java.util.*;
public class Main {
  static void printAllCols(int[][] mat){
    int rows = mat.length ;  
    int cols = mat[0].length;
   for(int c = 0 ; c < cols ; c++){
    if(c%2 == 0){
       for(int r = 0; r < rows ; r++){
      System.out.print(mat[r][c] + " ");
    }
    }else{
      for(int r = rows-1; r>=0 ; r--){
        System.out.print(mat[r][c]+ " ");
      }
    }
    
    System.out.println();
   }
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     //taking input N-rows and M columns 
     int N = sc.nextInt();
     int M = sc.nextInt();

     //taking 2-D array 
     int[][] mat = new int[N][M];

     //reading values 
     for(int i = 0 ; i < N ; i++){
      for(int j = 0 ; j < M ; j++){
        mat[i][j] = sc.nextInt();
      }
     }
     printAllCols(mat);
  }
}



//Printing max value among rows and columns -->
import java.util.*;
public class Main {
  static int printMaxElement(int[][] mat){
    int rows = mat.length ;  
    int cols = mat[0].length;
    int max = mat[0][0];
    // int max = Integer.MIN_VALUE;
    for( int r = 0 ; r < rows ; r++){
      for(int c = 0 ; c < cols ; c++){
        if(mat[r][c]> max){
          max = mat[r][c];
        }
      }
    }
    return max ;

  
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     //taking input N-rows and M columns 
     int N = sc.nextInt();
     int M = sc.nextInt();

     //taking 2-D array 
     int[][] mat = new int[N][M];

     //reading values 
     for(int i = 0 ; i < N ; i++){
      for(int j = 0 ; j < M ; j++){
        mat[i][j] = sc.nextInt();
      }
     }
     int maxElement = printMaxElement(mat);
     System.out.println(maxElement);

  }
}


// Finding out maximum integer in each row
import java.util.*;
public class Main {
  static int[] printMaxElement(int[][] mat){
    int rows = mat.length ;  
    int cols = mat[0].length;
    int[] ans = new int[rows];
    int max = mat[0][0];
    // int max = Integer.MIN_VALUE;
    for( int r = 0 ; r < rows ; r++){
      for(int c = 0 ; c < cols ; c++){
        if(mat[r][c]> max){
          max = mat[r][c];
        }
      }
      ans[r] = max;
      System.out.print(ans[r] + " ");
     
    }
    return ans ;

  
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     //taking input N-rows and M columns 
     int N = sc.nextInt();
     int M = sc.nextInt();

     //taking 2-D array 
     int[][] mat = new int[N][M];

     //reading values 
     for(int i = 0 ; i < N ; i++){
      for(int j = 0 ; j < M ; j++){
        mat[i][j] = sc.nextInt();
      }
     }
   printMaxElement(mat);
    //  System.out.println(maxElement);

  }
}


//Assignment problem 6th
//Given 2D Array A[][] and Row index B, return max of Bth row.
import java.util.*;
public class Main {
  static int printMaxLastRow(int[][] mat, int B){
    int rows = mat.length ;  
    int cols = mat[0].length;
    int max = mat[B][0];
    // int max = Integer.MIN_VALUE;
    for(int c = 0 ; c < cols ; c++){
      if(mat[B][c] > max){
        max = mat[B][c];
      }
    }
    return max ;

  
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     //taking input N-rows and M columns 
     int N = sc.nextInt();
     int M = sc.nextInt();

     //taking 2-D array 
     int[][] mat = new int[N][M];
     int B = 2 ;

     //reading values 
     for(int i = 0 ; i < N ; i++){
      for(int j = 0 ; j < M ; j++){
        mat[i][j] = sc.nextInt();
      }
     }
     int maxElement = printMaxLastRow(mat,B);
     System.out.println(maxElement);

  }
}
//input 
// A = [[12, 65, 89, 74],
//      [22, 44, 12, 30],
//      [10, 12, 97, 19]]
// B = 2

//97



