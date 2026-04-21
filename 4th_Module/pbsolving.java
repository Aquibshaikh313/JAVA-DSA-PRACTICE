//Count of factors

public class Main {
  static int countFactors(int A){
    int count = 0;
    for(int i = 1 ; i*i <= A ; i++){
      if(A%i == 0){
        if(i == A/i){
        count +=1;
      }else{
        count+=2;
      }
      }
    }
    return count;
  }
  public static void main(String[] args) {
      int A = 5;
      System.out.print(countFactors(A));
  }
}

//check prime no.

public class Main {
  static int countFactors(int A){
    int count = 0;
    for(int i = 1 ; i*i <= A ; i++){
      if(A%i == 0){
        if(i == A/i){
        count +=1;
      }else{
        count+=2;
      }
      }
    }
    if(count == 2){
      return 1;
    }else{
      return 0 ;
    }
  }
  public static void main(String[] args) {
      int A = 5;
      System.out.print(countFactors(A));
  }
}

// What will be the total number of iterations in the following code?

for (int i = 0; i < n; i++) {

    for (int j = 0; j <= i; j++) {

        print(i + j);
    }
}
Output : n*(n+1) / 2


// Find the number of iterations in the following code snippet:

int ans = 0;
for (int i = 0; i < n; i++)
{
    ans += i * i;
}

Output : n iterations