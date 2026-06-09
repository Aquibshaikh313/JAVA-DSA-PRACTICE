# Recursion Practice Sheet (Java)

---

# 1. Binary Exponentiation / Fast Exponentiation

### Time Complexity

* O(log n)

### Space Complexity

* O(log n)

### Idea

Instead of multiplying `a` exactly `n` times, compute:

* `aⁿ = (aⁿ⁄²)²` when `n` is even
* `aⁿ = (aⁿ⁄²)² × a` when `n` is odd

```java
public class Main {

    static long pow(int a, int n) {
        if (n == 0) {
            return 1;
        }

        long t = pow(a, n / 2);

        if (n % 2 == 0) {
            return t * t;
        }

        return t * t * a;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 2;

        System.out.print(pow(a, n));
    }
}
```

Output:

```text
4
```

---

# 2. Print Array Using Recursion

### Idea

Print the current element and recursively move to the next index.

```java
public class Main {

    static void printArr(int[] arr, int idx) {

        if (idx == arr.length) {
            return;
        }

        System.out.print(arr[idx] + " ");

        printArr(arr, idx + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        printArr(arr, 0);
    }
}
```

Output:

```text
1 2 3 4 5
```

---

# 3. Sum of Array Using Recursion

### Idea

Add the current element with the sum of the remaining array.

```java
public class Main {

    static int sumOfArr(int[] arr, int idx) {

        if (idx == arr.length - 1) {
            return arr[idx];
        }

        return arr[idx] + sumOfArr(arr, idx + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.print(sumOfArr(arr, 0));
    }
}
```

### Dry Run

| Call            | Returned Value |
| --------------- | -------------- |
| sumOfArr(arr,4) | 5              |
| sumOfArr(arr,3) | 4 + 5 = 9      |
| sumOfArr(arr,2) | 3 + 9 = 12     |
| sumOfArr(arr,1) | 2 + 12 = 14    |
| sumOfArr(arr,0) | 1 + 14 = 15    |

Output:

```text
15
```

---

# 4. Palindrome Check Using Recursion

### Idea

Compare characters from both ends and move inward.

```java
public class Main {

    static boolean isPalind(char[] str, int l, int r) {

        if (l >= r) {
            return true;
        }

        return str[l] == str[r] &&
               isPalind(str, l + 1, r - 1);
    }

    public static void main(String[] args) {

        char[] str = {'r', 'a', 'd', 'a', 'r'};

        System.out.println(
                isPalind(str, 0, str.length - 1)
        );
    }
}
```

### Dry Run

| Step | l | r | str[l] | str[r] | Result      |
| ---- | - | - | ------ | ------ | ----------- |
| 1    | 0 | 4 | r      | r      | Match       |
| 2    | 1 | 3 | a      | a      | Match       |
| 3    | 2 | 2 | d      | d      | Base Case   |
| 4    | - | - | -      | -      | Return true |

Output:

```text
true
```

---

# 5. Find All Indices of B in an Array

### Idea

Count occurrences during recursion and create the result array while returning.

```java
import java.util.Arrays;

public class Main {

    static int[] recurr(int[] A, int B, int idx, int count) {

        if (idx == A.length) {
            return new int[count];
        }

        if (A[idx] == B) {

            int[] ans =
                    recurr(A, B, idx + 1, count + 1);

            ans[count] = idx;

            return ans;
        }

        return recurr(A, B, idx + 1, count);
    }

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 1, 1};
        int B = 1;

        int[] result =
                recurr(A, B, 0, 0);

        System.out.println(
                Arrays.toString(result)
        );
    }
}
```

Output:

```text
[0, 3, 4]
```

---

# 6. Tower of Hanoi

### Rules

1. Move only one disk at a time.
2. A larger disk cannot be placed on a smaller disk.
3. Use the helper tower when required.

### Parameters

* `n` → Number of disks
* `A` → Source
* `B` → Helper
* `C` → Destination

### Recursive Strategy

1. Move `n-1` disks from A → B.
2. Move largest disk from A → C.
3. Move `n-1` disks from B → C.

```java
public class Main {

    static void TOH(int n, int A, int B, int C) {

        if (n > 0) {

            TOH(n - 1, A, C, B);

            System.out.printf(
                    "Move a Disc from %d to %d\n",
                    A, C
            );

            TOH(n - 1, B, A, C);
        }
    }

    public static void main(String[] args) {

        int n = 3;

        TOH(n, 1, 2, 3);
    }
}
```

Output:

```text
Move a Disc from 1 to 3
Move a Disc from 1 to 2
Move a Disc from 3 to 2
Move a Disc from 1 to 3
Move a Disc from 2 to 1
Move a Disc from 2 to 3
Move a Disc from 1 to 3
```

### Complexity

* Time Complexity: O(2ⁿ)
* Space Complexity: O(n)

---

# Recursion Template

```java
returnType function(parameters) {

    // Base Case
    if (baseCondition) {
        return baseValue;
    }

    // Recursive Call
    return combine(
            currentWork,
            function(smallerProblem)
    );
}
```

### Steps to Solve Any Recursion Problem

1. Identify the smaller subproblem.
2. Define the base case.
3. Assume recursion works for the smaller problem.
4. Use that answer to solve the current problem.
5. Return the result.

```
```
