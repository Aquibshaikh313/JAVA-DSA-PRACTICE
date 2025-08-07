// --------------------------------------------------
// CHARACTER DATA TYPE & TYPECASTING DEMOS
// --------------------------------------------------
public class Main1 {
    public static void main(String[] args) {

        // ASCII conversion: char to int
        int asciiValue = 'A';
        System.out.println(asciiValue); // Output: 65

        // ASCII conversion: int to char
        System.out.println((char) 65);  // Output: A

        // Comparing characters
        if ('a' > 'A') {
            System.out.println("'a' is greater than 'A' (based on ASCII values)"); // Output: true
        }

        // Character comparison example
        char ch = 'A';
        if (ch >= 90) {
            System.out.println("Greater");
        } else {
            System.out.println("Smaller"); // Output: Smaller
        }

        // Typecasting examples
        char ch2 = 68; // ASCII of D
        System.out.println(ch2); // Output: D

        char ch3 = 'A';
        ch3 += 2; // Implicit cast: A + 2 → C
        System.out.println(ch3); // Output: C

        // Below will give error: ch3 = ch3 + 2; (needs explicit cast)
        // ch3 = (char)(ch3 + 2);
    }
}


// --------------------------------------------------
// STRING METHODS & CHARACTER ACCESS
// --------------------------------------------------
public class Main2 {
    public static void main(String[] args) {
        String str = "sanjay shettigar";

        // Character at index
        System.out.println(str.charAt(3)); // Output: j

        // Length of string (includes spaces)
        System.out.println(str.length()); // Output: 16

        // Substring: from index 2 to 5 (exclusive of 5)
        System.out.println(str.substring(2, 5)); // Output: nja

        String name = "Aquib shaikh";

        // Substring from index 6 to end
        System.out.println(name.substring(6)); // Output: shaikh

        // Substring from index 6 to name.length() (i.e., 6 to 12)
        System.out.println(name.substring(6, name.length())); // Output: shaikh

        // indexOf usage
        System.out.println(name.indexOf("shaikh", 3)); // Output: 6

        // Accessing each character using loop
        String name2 = "Aquib";
        for (int i = 0; i < name2.length(); i++) {
            System.out.println("Character at " + i + " is : " + name2.charAt(i));
        }
    }
}

// --------------------------------------------------
// TAKING CHARACTER INPUT FROM USER
// --------------------------------------------------
// import java.util.*;

// public class Main3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a character: ");
//         char ch = sc.next().charAt(0); // Reads first character from input
//         System.out.println("You entered: " + ch);
//     }
// }

// --------------------------------------------------
// PRINT CHARACTER PATTERN 
// --------------------------------------------------
// import java.util.*;

// public class Main4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();

//         for (int i = 1; i <= N; i++) {
//             char A = 'A';
//             for (int j = 0; j < i; j++) {
//                 System.out.print(A + "_");
//                 A++; // move to next character
//             }
//             System.out.println();
//         }
//     }
// }

// Output -->
A _ 
A _ B _ 
A _ B _ C _ 
A _ B _ C _ D _ 
A _ B _ C _ D _ E _ 




// --------------------------------------------------
// REMOVE LAST CHARACTER FROM STRING
// --------------------------------------------------

// import java.util.*;
// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     String str = sc.next();
//     // String str = "Sanjay";
//     for(int i = 0 ; i < str.length()-1 ; i++){
//       // System.out.println( "Character at " + i + "is :"  str.charA(i));
//       System.out.print( str.charAt(i));
//     }
     
//   }
// }

// --------------------------------------------------
// COUNT VOWELS AND CONSONANTS
// --------------------------------------------------
// import java.util.*;

// public class Main {

//     public static int[] countVowelsAndConsonants(String A) {
//         int vow = 0;
//         int consonant = 0;
//         int[] B = new int[2];

//         for (int i = 0; i < A.length(); i++) {
//             char ch = A.charAt(i);

//             // Check for vowels
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch== 'u') {
//                 vow++;
//             }
//             // Check for lowercase consonants
//             else if (ch >= 'a' && ch <= 'z') {
//                 consonant++;
//             }
//             // Other characters (digits, symbols, spaces) are ignored
//         }

//         B[0] = vow;
//         B[1] = consonant;
//         return B;
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         System.out.print("Enter a lowercase string: ");
//         String input = scn.nextLine();  // Read the entire line

//         int[] result = countVowelsAndConsonants(input);

//         System.out.println("Number of vowels: " + result[0]);
//         System.out.println("Number of consonants: " + result[1]);
//     }
// }

