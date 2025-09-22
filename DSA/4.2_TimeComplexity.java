//Calculating the Time Complexity 
//Below are the assignment pbs of Time Complexity

for (int i = 1; i <= n; i += 2) {
    System.out.print(i);
} 
// O(n)

static void solve(int N, int M){
  for(int i = 1 ; i <= N ; i++){
    //statement
  }

  for(int i = 1 ; i <= M ; i++){
    //statement
  }
}
//O(N + M)

static int func(int n) {
    int s = 0;
    for (int i = 1; i <= 100; i++) {
        s += i;
    }
    return s;
}
// O(1) since the n here was 100

static int func(int n) {
    int s = 0;
    for (int i = 0; i < n; i = i * 2) {
        s += i;
    }
    return s;
}
// O(infinity) becoz value of i is not incremented so it will continue with 0 only

for (int i = 0 ; i < n ; i++){
  for(int j = 0 ; j <= i ; j++){
    Sop(i+j)
  }
  sopln()
}
//O(n^2)

for (int i = 1 ; i <= n ; i*=2){
  for(int j = 1 ; j <= n ; j++){
    Sop(i+j)
  }
  sopln()
}
//O(n*logn)

int a = 0 ; i = N ;
while(i){
  a = a + i ;
  i = i / 2;
}
//O(log N)


for (int i = 1; i <= 100; i *= 2) {
    for (int j = 1; j <= n; j++) {
        System.out.print(i + j + " ");
    }
    System.out.println();
}
//O(n)


for(int i = 0 ; i < N ; i++){
for(int j = i ; j< N ; j++){
//statement
}} 
//O(n^2)

int count = 0 ;
while(N > 0){
  count++;
  N/= 3;
}
//O(log(N)) {Base 3}


//Doubt in below two
public void solve(){
  int i = 1;
  while (i < n ){
    int x = i ;
    while(x-- > 0){
      //O(1) operation
    }
    i++;
  }
}
//O(n^2)

int a = 0 ;
for( int i = 0 ; i < N ; i++){
  for(int j = N ; j > i ; --j){
    a+= i + j;
  }
}
//O(N^2)


//Additinal Assignments starts form here ---------------->

What is the time complexity of the following code snippet
int func(int n){
int s = 0;
for(int i = 1 ; i*i*i <= n ; i++){
s = s + i;
}
return s;
}
//O(n^(1/3))

What is the time complexity of the following code snippet

for(int i = 1 ; i <= n ; i++){
for(int j = 1 ; j <= 3^i ; j++){
print(i + j);
}}

//O(3^n)

for(int i = 0 ; i < n ; i++){
  for(int j = i - 1 ; j >= 0 ; j++){
    ans += i + j;
  }
}
// issue with this one

int a = 0 , b = 0;
for(int i=0; i< N; i++){
  for(int j = 0 ; j < N ; j++){
    a = a + j;
  }
}
for(int k = 0 ; k < N ; k++){
  b = b + k;
}
//O(N * N) time, O(1) space

public void solve (int N){
  for(int i = 0 ; i < Math.pow(2,N); i++){
    int  j = i;
    while(j>0){
      j-= 1;
    }
  }
}
//O(4^N)

int ans = 0 ;
for(int i = 0 ; i < n ; i++){
  ans+= i * i ;

}return ans;
//O(n)

int sum = 0;
for(int i = 0 ; i <= N ; i++){
  for(int j = i ; j <= N && j > i, j++){
    sum += i;
  }
}
//O(N^2)

public void function (int n){
  while(n > 0){
    n++;
    n -= 2;
  }
}
//O(n)