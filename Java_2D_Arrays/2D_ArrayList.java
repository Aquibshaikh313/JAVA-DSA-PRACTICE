//Printing the ArrayList -->
import java.util.*;

public class Main {
  static void print (ArrayList<ArrayList<Integer>> arr ){
    int n = arr.size();
  
    //iterate over each rows 
    for(int i = 0 ; i < n ; i++){
      //Get no. of columns in current rows  -->
      int m = arr.get(i).size(); //no. of columns in current rows
      for(int j = 0 ; j < m ; j ++ ){
        System.out.print(arr.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    //2D ArrayList matrix

    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    
      for (int i = 0; i < n; i++) {
      ArrayList<Integer> row = new ArrayList<>();
      for (int j = 0; j < m; j++) {
        int colNum = sc.nextInt();
        row.add(colNum);  // add colnum to the row
      }
           arr.add(row); // add row to the main 2D list
    }
    print(arr);
  
  }
}
//Input     output
2 3         
1 2 3       1 2 3
4 5 6       4 5 6

//****************Printing Unique elements*****************

import java.util.ArrayList; // Import ArrayList class so we can use it

public class Main {

  // This method takes a matrix (list of lists) and returns, for each row, the elements that appear exactly once
  static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> al) {
    int n = al.size();                  // number of rows in the matrix
    int m = al.get(0).size();            // number of columns in the first row
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); // final answer: one list of uniques per row

    // Loop through each row
    for (int i = 0; i < n; i++) {
      ArrayList<Integer> uniqElements = new ArrayList<>(); // store unique elements for this row

      // Loop through each element in the row
      for (int j = 0; j < m; j++) {
        int ele = al.get(i).get(j);        // current element in row i, column j

        // Check if this element appears exactly once in this row
        if (freq(al.get(i), ele) == 1) {
          uniqElements.add(ele);           // add it to the unique elements list for this row
        }
      }

      ans.add(uniqElements);               // add this row's unique list to the final answer
    }

    return ans; // return the list of lists containing unique elements for each row
  }

  // This method counts how many times 'K' appears in the given list 'al'
  static int freq(ArrayList<Integer> al, int K) {
    int count = 0;                     // counter for occurrences
    for (int i = 0; i < al.size(); i++) {
      if (al.get(i) == K) {             // if the current element matches K
        count++;                        // increase the count
      }
    }
    return count;                       // return total times K appeared
  }

  public static void main(String[] args) {
    // Create sample input matrix
    ArrayList<ArrayList<Integer>> data = new ArrayList<>();
    data.add(new ArrayList<Integer>() {{ add(1); add(2); add(2); add(3); }}); // row 0
    data.add(new ArrayList<Integer>() {{ add(4); add(4); add(5); add(6); }}); // row 1

    // Call the solve method and store the result
    ArrayList<ArrayList<Integer>> result = solve(data);

    // Print the result
    System.out.println(result); // Expected: [[1, 3], [5, 6]]
  }
}



//Max in array -->
static int findMax(int[] array){
  int max = array[0];
  for(int i = 1 ; i < array.length ; i++){
    max = Math.max(max,array[i]);
  }
  return max ;
}

//Min in array -->
static int findMin(int[] array){
  int min = array[0];
  for(int i = 1 ; i < array.length ; i++){
    max = Math.min(min,array[i]);
  }
  return min ;
}

//reverse array -->
static int revArray(int[] array){
  int n = arr.length;
 
  for(int i = n-1 ; i>=0 ; i--){
    System.out.print(arr[i] + " ");
  }
}

//Below are methods for ArrayList -->
// Collections.max() and Collections.min(),Collections.reverse(list)

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 5, 40, 30);
        
        int max = Collections.max(list);
        int min = Collections.min(list);
        
        System.out.println("Max: " + max); // Output: Max: 40
        System.out.println("Min: " + min); // Output: Min: 5
    }
}

//One complete example 
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(12, 45, 7, 29, 85, 33);

//         // Print elements step-by-step
//         System.out.println("Iterating through the list:");
//         for (int i = 0; i < list.size(); i++) {
//             System.out.println("Element at index " + i + ": " + list.get(i));
//         }

//         // Use Collections.max to find the max value
//         int max = Collections.max(list);
//         System.out.println("\nMaximum value in the list is: " + max);
//     }
// }
//output
// Iterating through the list:
// Element at index 0: 12
// Element at index 1: 45
// Element at index 2: 7
// Element at index 3: 29
// Element at index 4: 85
// Element at index 5: 33

// Maximum value in the list is: 85



// Collections.reverse()

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Collections.reverse(list);
        System.out.println(list); // Output: [5, 4, 3, 2, 1]
    }
}


//********************Extracting vowels frm string********************
ArrayList<ArrayList<Character>> extractVowels(ArrayList<String> string) {  // Method that takes a list of strings and returns a list of vowel lists

    ArrayList<ArrayList<Character>> vowelsList = new ArrayList<>();       // This will hold lists of vowels for each string

    ArrayList<Character> vowels = new ArrayList<>();                      // Create a list to store all vowels

    Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u',                    // Add lowercase and uppercase vowels to the list
                              'A', 'E', 'I', 'O', 'U');                    // So we can match against any case

    for (int i = 0; i < string.size(); i++) {                              // Loop through each string in the input list
        String s = string.get(i);                                          // Get the current string
        ArrayList<Character> vowelList = new ArrayList<>();              // List to store vowels from the current string

        for (int j = 0; j < s.length(); j++) {                            // Loop through each character in the string
            char c = s.charAt(j);                                         // Get character at index j
            if (vowels.contains(c)) {                                     // Check if the character is a vowel
                vowelList.add(c);                                         // If yes, add it to the vowel list
            }
        }

        vowelsList.add(vowelList);                                        // Add the vowel list of the current string to the main list
    }

    return vowelsList;                                                    // Return the final list of lists of vowels
}


//**********Creating staircase pattern using arraylist******************
ArrayList<ArrayList<String>> createStairCasePattern(int n) {           // Method that returns a 2D pattern (staircase) of strings, takes int n

    ArrayList<ArrayList<String>> ans = new ArrayList<>();              // This will store the final pattern as a list of rows

    for (int i = 0; i < n; i++) {                                      // Outer loop: runs 'n' times for 'n' rows
        ArrayList<String> row = new ArrayList<>();                     // Create a new list to store the current row

        for (int j = 0; j <= i; j++) {                                 // Add '#' for current row (i+1 times)
            row.add("#");                                              // Add hash symbol
        }

        for (int j = i + 1; j < n; j++) {                              // Fill the rest with spaces to make it n elements
            row.add(" ");                                              // Add space to keep row length uniform
        }

        ans.add(row);                                                  // Add the completed row to the answer list
    }

    return ans;                                                        // Return the final 2D staircase pattern
}


//************************Sum of Column****************************
import java.util.*;

public class Main {

    static ArrayList<Integer> sumOfCols(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();

        // Loop over columns
        for (int j = 0; j < A.get(0).size(); j++) {
            int sum = 0;
            // Loop over rows
            for (int i = 0; i < A.size(); i++) {
                sum += A.get(i).get(j);
            }
            result.add(sum);  // add sum of this column
        }
        return result;  // return after outer loop
    }

    public static void main(String[] args) {
        // Proper way to create a 2D ArrayList
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        A.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));

        ArrayList<Integer> ans = sumOfCols(A);

        System.out.println(ans);
    }
}
