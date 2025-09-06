# Revision Notes: LCM, HCF (GCD), and Nested Loops

This document contains definitions and basic Java code examples for **LCM**, **HCF (GCD)**, and **nested loops** for easy revision.

---


## 📌 1. HCF / GCD (Highest Common Factor)
**Definition**:  
The **HCF (Highest Common Factor)** or **GCD (Greatest Common Divisor)** of two numbers is the **largest positive integer that divides both numbers exactly (without leaving a remainder).**

### Example:
- Numbers: `5` and `10`  
- Divisors of 5 → {1, 5}  
- Divisors of 10 → {1, 2, 5, 10}  
- Common divisors → {1, 5}  
- **HCF = 5**

### Java Code (basic loop method):
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int HCF = 0;
        int n = Math.min(a, b);

        for (int i = n; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                HCF = i;
                break;
            }
        }
        System.out.println("HCF = " + HCF);
    }
}


int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}


---

## 📌 2. LCM (Least Common Multiple)
**Definition**:  
The **LCM (Least Common Multiple)** of two numbers is the **smallest positive integer** that is divisible by both numbers.

### Example:
- Numbers: `5` and `10`  
- Multiples of 5 → {5, 10, 15, 20, …}  
- Multiples of 10 → {10, 20, 30, …}  
- Common multiples → {10, 20, 30, …}  
- **LCM = 10**

### Java Code (basic loop method):
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int LCM = 0;

        for (int i = Math.max(a, b); i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                LCM = i;
                break;
            }
        }
        System.out.println("LCM = " + LCM);
    }
}
