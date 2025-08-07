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

import java.util.*;

public class Main {

    public static ArrayList<ArrayList<Integer>> Solve(ArrayList<ArrayList<Integer>> al) {
        int n = al.size(); // number of rows
        int m = al.get(0).size(); // number of columns

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> uniq = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                int ele = al.get(i).get(j);
                if (freq(al.get(i), ele) == 1) {
                    uniq.add(ele);
                }
            }
            ans.add(uniq); // should be inside the loop
        }

        return ans;
    }

    public static int freq(ArrayList<Integer> al, int K) {
        int count = 0;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i)== K) { // use equals for Integer comparison
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> input = new ArrayList<>();

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(sc.nextInt());
            }
            input.add(row);
        }

        ArrayList<ArrayList<Integer>> result = Solve(input);

        System.out.println("Unique elements in each row:");
        for (ArrayList<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
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


// Collections.max() and Collections.min()

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
