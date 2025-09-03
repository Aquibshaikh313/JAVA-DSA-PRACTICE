//********Create a string containing only lowercases letters ***********

public class Main {
  static String printLowerCase(String str){
    int n = str.length();
    StringBuilder ans = new StringBuilder();
      for(int i = 0; i < n ; i++){
    char ch = str.charAt(i);    
      if(ch >= 97 && ch <= 122){
        ans.append(ch);
      }
    }
    return ans.toString();
  }
  public static void main(String[] args) {
     String str = "HeLlO";
     
     System.out.println (printLowerCase(str));
  }
}

// Given a string A of length N and a character B replace all occurrences of B in string A with character
// Problem Statement : Given a string A of length N and a character B, replace all occurrences of B in string A with character '@'.

public class Main {
  static String replaceWith(String str){
    int n = str.length();
    StringBuilder ans = new StringBuilder();
    for(int i = 0 ; i < n ; i++){
      if(str.charAt(i) == 'a'){
        ans.append('@');
      }else{
        ans.append(str.charAt(i));
      }
    }
    return ans.toString();
      
  }
  public static void main(String[] args) {
     String str = "abcad";
     
     System.out.println (replaceWith(str));
  }
}

//Finding the Longest string ------>
public class Main {
  static int longestWordLength(String line) {
    int maxLength = 0;
    int currLength = 0;
    int n = line.length();

    for (int i = 0; i < n; i++) {
      char currChar = line.charAt(i);
      if (currChar != ' ') {
        currLength++;
      } else {
        if (currLength > maxLength) {
          maxLength = currLength;
        }
        currLength = 0;
      }
    }

    // Final check for the last word
    if (currLength > maxLength) {
      maxLength = currLength;
    }

    return maxLength;
  }

  public static void main(String[] args) {
    String line = "hi hello bro";
    System.out.println(longestWordLength(line));  // Output: 5 ("hello")
  }
}



//****************alphaNumericSum of digits in string**************
public class Main {
  static int alphaNumericSum(String A){
    int n = A.length();
    int sum = 0;
    for(int i = 0 ; i < n ; i++){
      char ch = A.charAt(i);
      if(ch>='0' && ch <= '9'){
        int num = 0;
        while(i < n && A.charAt(i) >= '0' && A.charAt(i) <= '9'){
          num = num * 10 + (A.charAt(i) - '0') ;
          i++;
        }
        sum += num;
      }
    }
    return sum;
  }
  public static void main(String[] args) {
      String A = "a125b34c";
       System.out.println("Sum of numbers: " + alphaNumericSum(A)); // direct call
    
  }
}


// checking wheather the string is palindrome or not if the start and end of index are given
public class Main {
  static boolean isPalindrome(String str,int start,int end){
   while( start <  end ){
    if(str.charAt(start) == str.charAt(end)){
      start++;
      end--;
    }
    else{
      return false;
    }
   }
   return true;

  }
  public static void main(String[] args) {
      String str = "anamadamscope";
      int start = 3;
      int end = 7;
     boolean result = isPalindrome(str, start, end);
        System.out.println("Is palindrome? " + result);
    
  }
}