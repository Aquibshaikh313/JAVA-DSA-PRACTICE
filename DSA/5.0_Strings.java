// Given a char[] consisting of only alphabets (either lowercase or uppercase).Print all the characters of string in such a way that for all the lowercase charcter,print its uppercase character and viceversa.


public class Main {
  public static void toggleCase(char[] str){
    int n = str.length;
    int diff = 'a' - 'A';
    for(int i = 0 ; i < n ; i++){
      //check for uppercase
      if(str[i] >= 'A' && str[i] <= 'Z'){
        //uppercase
        // System.out.print((char)(str[i] + 32));
        str[i] = (char)(str[i] + diff);
      }else{
        //lowercase
      //  System.out.print((char)(str[i]-32));
      str[i] = (char)(str[i] - diff);
      }
    }
  }
  public static void main(String[] args) {
  
  char[] str = {'H', 'e', 'L', 'l','o'};

  toggleCase(str);

  for(int i = 0 ; i < str.length ; i++){
    System.out.print(str[i]);

  }

     
  }
}


//find the length of longest palindrome
public class Main {
  public static int longPalindr(char[] str){

    int n = str.length;
    int ans = Integer.MIN_VALUE;

    for(int i = 0 ; i < n ; i++ ){
      //checking for odd p1 = i & p2 = i
      int p2 = i,p1 = i;
      ans = Math.max(ans,expand(str,p1,p2,n));
    }

    for(int i = 0 ; i < n  ; i++ ){
      //checking for even p1 = i & p2 = i+1
      int p2 = i+1,p1 = i;
      ans = Math.max(ans,expand(str,p1,p2,n));
    }

    return ans;

   
  }
  static int expand(char[] str , int p1, int p2, int n){
    while(p1>=0 && p2 < n && str[p1] == str[p2]){
      p1--;
      p2++;
    }
    return p2 - p1 - 1;
  }
  public static void main(String[] args) {
  
  char[] str = {'a', 'b', 'c', 'd','c','k','k','c','d'};

  longPalindr(str);
   int ans = longPalindr(str);
        System.out.println("Length of longest palindrome: " + ans);

  

     
  }
}