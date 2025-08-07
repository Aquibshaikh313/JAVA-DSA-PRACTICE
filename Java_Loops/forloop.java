import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // ===================== 1. Print numbers from 1 to 5 =====================
    // for (int i = 1; i <= 5; i++) {
    //   System.out.print(i + " ");
    // }

    // ===================== 2. Print even numbers from 1 to n =====================
    // int n = scn.nextInt();
    // for (int i = 1; i <= n; i++) {
    //   if (i % 2 == 0) {
    //     System.out.print(i + " ");
    //   }
    // }

    // === Alternate method: start from 2 and increment by 2 ===
    // int n = scn.nextInt();
    // for (int i = 2; i <= n; i += 2) {
    //   System.out.print(i + " ");
    // }

    // ===================== 3. Print digits in reverse =====================
    // int n = scn.nextInt();
    // while (n > 0) {
    //   int digit = n % 10;
    //   System.out.print(digit + " ");
    //   n /= 10;
    // }

    // === Same with for loop ===
    // for (; n > 0; n /= 10) {
    //   int digit = n % 10;
    //   System.out.print(digit + " ");
    // }

    // ===================== 4. Handle negative input before reversing digits =====================
    // int n = scn.nextInt();
    // if (n < 0) {
    //   n = -n;
    // } else if (n == 0) {
    //   System.out.print(0);
    // }
    // while (n > 0) {
    //   int digit = n % 10;
    //   System.out.print(digit + " ");
    //   n /= 10;
    // }

    // ===================== 5. Count number of digits =====================
    // int n = scn.nextInt();
    // int count = 0;
    // while (n > 0) {
    //   n /= 10;
    //   count++;
    // }
    // System.out.print(count);

    // === Using for loop ===
    // int count = 0;
    // for (; n > 0; n /= 10) {
    //   count++;
    // }
    // System.out.print(count);

    // ===================== 6. Sum of digits (handle negative input) =====================
    // int n = scn.nextInt();
    // if (n < 0) {
    //   n = -n;
    // }
    // int sum = 0;
    // for (; n > 0; n /= 10) {
    //   int digit = n % 10;
    //   sum += digit;
    // }
    // System.out.print(sum);

    // ===================== 7. Print multiples of 4 up to n =====================
    // int n = scn.nextInt();
    // for (int i = 1; i <= n; i++) {
    //   if (i % 4 == 0) {
    //     System.out.print(i + " ");
    //   }
    // }

    // ===================== 8. Print natural numbers from n to 1 =====================
    // int n = scn.nextInt();
    // for (; n >= 1; n--) {
    //   System.out.print(n + " ");
    // }

    // ===================== 9. Print natural numbers from n to 5 =====================
    // int n = scn.nextInt();
    // for (; n <= 5; n++) {
    //   System.out.print(n + " ");
    // }

    // ===================== 10. Print last digit of number =====================
    // int n = scn.nextInt(); // e.g., 1140
    // int lastDigit = n % 10;
    // System.out.print(lastDigit);

    // ===================== 11. Print digits in reverse =====================
    // int n = scn.nextInt(); // e.g., 1245 → 5 4 2 1
    // for (; n >= 1; n /= 10) {
    //   int digit = n % 10;
    //   System.out.print(digit + " ");
    // }

    // === Handle negative number before reverse ===
    // int n = scn.nextInt(); // e.g., -1245 → 5 4 2 1
    // if (n < 0) {
    //   n = -n;
    // }
    // for (; n >= 1; n /= 10) {
    //   int digit = n % 10;
    //   System.out.print(digit + " ");
    // }

    // ===================== 12. Sum of digits =====================
    // int n = scn.nextInt(); // e.g., 123 → 6
    // int sum = 0;
    // for (; n >= 1; n /= 10) {
    //   int digit = n % 10;
    //   sum += digit;
    // }
    // System.out.print(sum);

    // ===================== 13. Print numbers from A to B =====================
    // int a = scn.nextInt(); // e.g., 5
    // int b = scn.nextInt(); // e.g., 10
    // for (; a <= b; a++) {
    //   System.out.print(a + " ");
    // }

    // ===================== 14. Odd and Even Digit Sums =====================
    // int n = scn.nextInt(); // e.g., 1234 → even: 6, odd: 4
    // int evenSum = 0;
    // int oddSum = 0;
    // for (; n > 0; n /= 10) {
    //   int digit = n % 10;
    //   if (digit % 2 == 0) {
    //     evenSum += digit;
    //   } else {
    //     oddSum += digit;
    //   }
    // }
    // System.out.println("Sum of even digits: " + evenSum);
    // System.out.println("Sum of odd digits: " + oddSum);
  }
}
