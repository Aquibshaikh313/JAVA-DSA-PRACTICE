// finding the pairs divisible by m
// TC O(N) and SC O(M)

public class Main {
  static int countPairs(int[] arr, int m) {
   int n = arr.length;
   int[] freq = new int[m]; // size should be the size of m
   int count = 0 ; int pair = 0 ;
   for(int i = 0 ; i < n ; i++){
    int rem = arr[i]%m; // remainder
    
    if(rem == 0){
      pair = 0;
    }else{
        pair = m - rem; // i.e the pair we are looking for
        
    }
     count += freq[pair];
    freq[rem]++;
   }

   return count;
   
  }

  

  public static void main(String[] args) {
     int[] arr = {4,3,6,3,8,12};
     int m = 6;

    System.out.print(countPairs(arr, m));
  }
}

| i | arr[i] | rem | pairRem | countBefore       | freq[] after  |
| - | ------ | --- | ------- | ----------------- | ------------- |
| 0 | 4      | 4   | 2       | 0                 | [0,0,0,0,1,0] |
| 1 | 3      | 3   | 3       | 0                 | [0,0,0,1,1,0] |
| 2 | 6      | 0   | 0       | 0                 | [1,0,0,1,1,0] |
| 3 | 3      | 3   | 3       | +1 (from freq[3]) | [1,0,0,2,1,0] |
| 4 | 8      | 2   | 4       | +1 (from freq[4]) | [1,0,1,2,1,0] |
| 5 | 12     | 0   | 0       | +1 (from freq[0]) | [2,0,1,2,1,0] |


//finding the highest common factor -->
public class Main {
  static int gcd(int a , int b){
    if(b == 0){
      return a;
    }
    return gcd(b,a%b);
  }
  public static void main(String[] args) {
     int a = 23;
     int b = 67;

     System.out.print(gcd(a,b));
  }
}

// TC: O(log(min(a,b)))

// On the basis of this two thing below the TC is calculated.f
// means here ("division") is basically subtracting we are reducing the numbers.

// and ("multiplication") here is kind of addition since each time value here gets double so the its exponentiation graph gets increase

//Calculating gcd of an entire array


public class Main {
  static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  static int gcd(int[] arr) {
    int ans = arr[0];
    for (int i = 1; i < arr.length; i++) {
      ans = gcd(ans, arr[i]);
    }
    return ans;
  }

  public static void main(String[] args) {
     int[] arr = {2,4,6,8};

    System.out.print(gcd(arr));
  }
}

//TC O(N * log(Max No.))
//same thing using recursion
public class Main {
  static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  static int gcdOfArray(int[] arr, int idx) {
    // Base case — last element
    if (idx == arr.length - 1) {
      return arr[idx];
    }

    int restGCD = gcdOfArray(arr, idx + 1);
    return gcd(arr[idx], restGCD);
  }

  public static void main(String[] args) {
     int[] arr = {2, 47, 3, 1};
     System.out.print(gcdOfArray(arr, 0));
  }
}

🧠 Dry run (for understanding)

arr = [2, 47, 3, 1]

Call	               idx	     Expression	            Return
gcdOfArray(arr, 3)  	3	       return arr[3]           1
gcdOfArray(arr, 2)  	2  	     gcd(3, 1)	             1
gcdOfArray(arr, 1)  	1     	 gcd(47, 1)	             1
gcdOfArray(arr, 0)  	0	       gcd(2, 1)	             1



