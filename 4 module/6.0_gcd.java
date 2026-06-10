# 1. Count Pairs Whose Sum is Divisible by m

### Idea

For every element:

* Find remainder: rem = arr[i] % m
* Required remainder = (m - rem) % m
* Check how many such remainders already exist using a frequency array.

### Code

```java
public class Main {

    static int countPairs(int[] arr, int m) {

        int[] freq = new int[m];
        int count = 0;

        for (int num : arr) {

            int rem = num % m;
            int pairRem = (m - rem) % m;

            count += freq[pairRem];
            freq[rem]++;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 3, 8, 12};
        int m = 6;

        System.out.println(countPairs(arr, m));
    }
}
```

### Dry Run

arr = [4, 3, 6, 3, 8, 12], m = 6

| i | arr[i] | rem | pairRem | Count Added |
| - | ------ | --- | ------- | ----------- |
| 0 | 4      | 4   | 2       | 0           |
| 1 | 3      | 3   | 3       | 0           |
| 2 | 6      | 0   | 0       | 0           |
| 3 | 3      | 3   | 3       | +1          |
| 4 | 8      | 2   | 4       | +1          |
| 5 | 12     | 0   | 0       | +1          |

Valid Pairs:
(3,3)
(4,8)
(6,12)

Time Complexity: O(N)

Space Complexity: O(M)

---

# 2. GCD / HCF of Two Numbers

### Euclidean Algorithm

Formula:

gcd(a,b) = gcd(b, a%b)

Base Case:

if(b == 0) return a

### Code

```java
public class Main {

    static int gcd(int a, int b) {

        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        int a = 23;
        int b = 67;

        System.out.println(gcd(a, b));
    }
}
```

### Dry Run

gcd(23,67)

→ gcd(67,23)

→ gcd(23,21)

→ gcd(21,2)

→ gcd(2,1)

→ gcd(1,0)

Answer = 1

Time Complexity: O(log(min(a,b)))

Space Complexity: O(log(min(a,b)))

---

# 3. GCD of an Entire Array (Iterative)

### Idea

gcd(a,b,c,d)

= gcd(gcd(gcd(a,b),c),d)

### Code

```java
public class Main {

    static int gcd(int a, int b) {

        if (b == 0)
            return a;

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

        int[] arr = {2, 4, 6, 8};

        System.out.println(gcd(arr));
    }
}
```

### Dry Run

arr = [2,4,6,8]

ans = 2

gcd(2,4) = 2

gcd(2,6) = 2

gcd(2,8) = 2

Final Answer = 2

Time Complexity: O(N × log(MaxElement))

Space Complexity: O(log(MaxElement))

---

# 4. GCD of Array Using Recursion

### Idea

gcd(arr[idx], gcd(rest of array))

### Code

```java
public class Main {

    static int gcd(int a, int b) {

        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    static int gcdOfArray(int[] arr, int idx) {

        if (idx == arr.length - 1)
            return arr[idx];

        int restGCD = gcdOfArray(arr, idx + 1);

        return gcd(arr[idx], restGCD);
    }

    public static void main(String[] args) {

        int[] arr = {2, 47, 3, 1};

        System.out.println(gcdOfArray(arr, 0));
    }
}
```

### Dry Run

arr = [2,47,3,1]

gcdOfArray(3) → 1

gcdOfArray(2) → gcd(3,1) = 1

gcdOfArray(1) → gcd(47,1) = 1

gcdOfArray(0) → gcd(2,1) = 1

Final Answer = 1

Time Complexity: O(N × log(MaxElement))

Space Complexity: O(N + log(MaxElement))

---

# Quick Revision Formulas

1. Pair Divisible by m

pairRem = (m - rem) % m

2. Euclidean GCD

gcd(a,b) = gcd(b, a%b)

3. Array GCD

gcd(a,b,c,d)

= gcd(gcd(gcd(a,b),c),d)

---

Complexity Summary

Count Pairs Divisible by m
TC = O(N)
SC = O(M)

GCD of Two Numbers
TC = O(log(min(a,b)))
SC = O(log(min(a,b)))

GCD of Array (Iterative)
TC = O(N × log(MaxElement))
SC = O(log(MaxElement))

GCD of Array (Recursive)
TC = O(N × log(MaxElement))
SC = O(N + log(MaxElement))
