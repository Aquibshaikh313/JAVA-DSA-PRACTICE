//****************Checking wheather its Identity Matrix******************
import java.util.*;
public class Main {
     static int solve(int[][] mat){
      int n = mat.length ;
      int m = mat[0].length;

      for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
          if(i==j && mat[i][j] != 1){
            return 0;
          }
          if(i!=j && mat[i][j]== 1){
            return 0 ;
          }
        }
      }
      return 1;

     }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     

    //  taking N & M from user 
     int N = sc.nextInt();//rows
     int M = sc.nextInt();//columns
      
      //for identity matrix it should be square i.e
      //No.of rows and columns should be equal if not return 0
      if (N != M) {
           System.out.println("0"); //we could have done return 0 ; but its void datatype
           return ;
        }

    //2D matrix
    int[][] mat = new int[N][M];

    //iterating over it 
    for(int i = 0 ; i < N ; i++){
      for(int j = 0 ; j < M ; j++){
        mat[i][j] = sc.nextInt();
      }
    }

     int result = solve(mat);
     System.out.println(result);
    
  }
}

//Transpose of rectangular matrix
//input
// 1 2 3    
// 4 5 6  

// output 
// 1 4
// 2 5
// 3 6

import java.util.*;
public class Main {
    static int[][] solve(int[][] mat){
      int n = mat.length ;
      int m = mat[0].length;

      int [][] transpose = new int [m][n]; //we are converting rows into columns

      
      for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
           transpose[j][i] = mat[i][j];
           
        }
      }
      return transpose;
           
    }

  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     

    //  taking N & M from user 
     int N = sc.nextInt();//rows
     int M = sc.nextInt();//columns
      
 
    //2D matrix
    int[][] mat = new int[N][M];

    //iterating over it 
    for(int i = 0 ; i < N ; i++){
      for(int j = 0 ; j < M ; j++){
        mat[i][j] = sc.nextInt();
      }
    }
    
    int[][] result = solve(mat);

    for(int i = 0 ; i < result.length ; i++){
      for(int j = 0 ; j < result[0].length ; j++){
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
    
  }
}

//Same problem but here we are taking Square matrix
import java.util.*;

public class Main {

    // Transpose the square matrix in-place
    static void solve(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap mat[i][j] with mat[j][i]
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of square matrix
        int N = sc.nextInt();

        // Initialize matrix
        int[][] mat = new int[N][N];

        // Read matrix elements
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Transpose the matrix in-place
        solve(mat);

        // Print the transposed matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//************************ */"Printing Diagonal ELements in matrix"*********************
import java.util.*;
public class Main {
  
  static void diagElem(int[][] mat){
    int n = mat.length; //since its a square matrix
    for(int i = 0 ; i < n ; i++){
      System.out.println(mat[i][i]);
    }
    return;
  }
  public static void main(String[] args) {
      int[][] mat = 
      {
        {1,2,3},
        {4,5,6},
        {7,8,9}
      };

      diagElem(mat);
  }
}

//********************************Adding two Different matrices********************************
import java.util.*;
public class Main {
  
  static int[][] diagElem(int[][] A, int[][] B){
    int n = A.length; //since its a square matrix
    int m = A[0].length;

    int[][] C = new int[n][m];
   
    for(int i = 0 ; i < n ; i++){
      for(int j = 0 ; j<m ;j++){
        C[i][j] = A[i][j]  + B[i][j] ;
      }
    }
    return C;
    
  }
  public static void main(String[] args) {
      int[][] A = 
      {
        {1,2},
        {3,4},
        {5,6}
      };
      int[][] B = 
      {
        {1,1},
        {1,1},
        {1,1}
      };
      


    int[][] result = diagElem(A, B);

        // Print the result properly
        System.out.println("Sum of matrices:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
  }
}


