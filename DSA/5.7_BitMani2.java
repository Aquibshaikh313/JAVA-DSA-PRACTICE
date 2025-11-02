// finding repeating elements:
public class Main {
  static int repeArr(int[] a){
    int ans = 0 ;
    int n = a.length;
    for(int i = 0 ; i < n; i++){
      ans = ans ^ a[i];
    }
    return ans;
  }
  public static void main(String[] args) {
     int[] a = {2,2,3,3,1,6,6};

     System.out.print(repeArr(a));
  }
} // TC: O(N^2)



public class Main {
  static void xorOfAll(int[] a){
    int ans = 0 ;
    int n = a.length;
    for(int i = 0 ; i < n; i++){
      ans = ans ^ a[i] ;
    }
    //find any set bit in xorOfAll
    int bit = 0 ;
    for( ; bit < 32 ; bit++){
      if((ans & (1 << bit)) != 0){
        break;
      }
    }

    //divide elements into 2grps 
    int num1= 0,num2 = 0;
    for(int i = 0 ; i < n ; i++){
      if((bit & (1 << a[i])) != 0){
        num1 ^= a[i];
      }else{
        num2 ^= a[i];
      }
    }
    System.out.println(num1);
    System.out.println(num2);
  }
  public static void main(String[] args) {
     int[] a = {2,2,3,3,1,9,6,6};

   xorOfAll(a);
  }
}

//integer occuring thrice

public class Main {
  static int noOccuringThrice(int[] arr){
   
   int ans = 0;
   for(int b = 0 ; b < 32 ; b++){
    int count = 0 ;
    int n = arr.length;
    for(int i = 0 ; i < n ; i++){
      int num = arr[i];
      if((num & (1 << b)) > 0){
        count++;
      }
    }
    if(count % 3 != 0){
      ans = ans|(1<<b); //set b bit
    }
   }
   return ans;

  }
  public static void main(String[] args) {
    
    int[] arr = {5,7,5,9,7,11,11,7,5,11};

     System.out.print(noOccuringThrice(arr));

     
  }
}//output 9



public class Main {
  static void xorOfAll(int[] arr){
    int n = arr.length;
   
  int xorOfAll = 0;
  for(int i = 0 ; i < n ; i++){
    xorOfAll = xorOfAll ^ arr[i];
  }
  //find any set bit in xorOfAll
  int bit = 0;
  for(; bit < 32; bit++){
    if((xorOfAll & (1 << bit)) > 0){
      break;
    }
  }

  //divide both of them in seperate grps
  int num1 = 0,num2 =0;
  for(int i = 0 ; i < n ; i++){
    if((arr[i]&(1<<bit)) > 0){
      num1 = num1 ^ arr[i];
    }else{
      num2 ^= arr[i];
    }
  }

  System.out.println(num1);
  System.out.print(num2);


  }
  public static void main(String[] args) {
    
    int[] arr = {5,7,5,2,11,11};
    
    xorOfAll(arr);
    //  System.out.print(xorOfAll(arr))/;

     
  }
}