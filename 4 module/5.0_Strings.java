# String & Character Array Problems in Java

## 1. Toggle Case of Characters

```java
public static void toggleCase(char[] str) {
    int diff = 'a' - 'A';

    for (int i = 0; i < str.length; i++) {
        if (str[i] >= 'A' && str[i] <= 'Z') {
            str[i] = (char)(str[i] + diff);
        } else {
            str[i] = (char)(str[i] - diff);
        }
    }
}
```

**Input:** `{'H','e','L','l','o'}`
**Output:** `hElLO`

---

## 2. Length of Longest Palindromic Substring

```java
public static int longPalindr(char[] str) {
    int n = str.length;
    int ans = Integer.MIN_VALUE;

    // Odd length palindrome
    for (int i = 0; i < n; i++) {
        ans = Math.max(ans, expand(str, i, i, n));
    }

    // Even length palindrome
    for (int i = 0; i < n; i++) {
        ans = Math.max(ans, expand(str, i, i + 1, n));
    }

    return ans;
}

static int expand(char[] str, int p1, int p2, int n) {
    while (p1 >= 0 && p2 < n && str[p1] == str[p2]) {
        p1--;
        p2++;
    }
    return p2 - p1 - 1;
}
```

**Time Complexity:** O(N²)
**Space Complexity:** O(1)

---

## 3. Reverse a String Using StringBuilder

```java
static String reverse(String str) {
    StringBuilder sb = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) {
        sb.append(str.charAt(i));
    }

    return sb.toString();
}
```

**Input:** `"Scaler"`
**Output:** `"relacS"`

---

## 4. Reverse Words of a String

```java
static String reverseWords(String str) {
    StringBuilder sb = new StringBuilder();

    String[] words = str.split(" ");

    for (int i = words.length - 1; i >= 0; i--) {
        sb.append(words[i]);

        if (i != 0) {
            sb.append(" ");
        }
    }

    return sb.toString();
}
```

**Input:** `"I love Java"`
**Output:** `"Java love I"`

---

## 5. Valid Palindrome (LeetCode 125)

```java
public boolean isPalindrome(String s) {
    int start = 0;
    int end = s.length() - 1;

    while (start < end) {

        char left = s.charAt(start);
        char right = s.charAt(end);

        if (!Character.isLetterOrDigit(left)) {
            start++;
            continue;
        }

        if (!Character.isLetterOrDigit(right)) {
            end--;
            continue;
        }

        if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
            return false;
        }

        start++;
        end--;
    }

    return true;
}
```

**Example:**
Input: `"A man, a plan, a canal: Panama"`
Output: `true`

**Time Complexity:** O(N)

---

## 6. Count Consecutive Characters (Run-Length Encoding)

```java
static String consCount(String str) {

    StringBuilder sb = new StringBuilder();
    int count = 1;

    for (int i = 0; i < str.length() - 1; i++) {

        if (str.charAt(i) == str.charAt(i + 1)) {
            count++;
        } else {
            sb.append(str.charAt(i));
            sb.append(count);
            count = 1;
        }
    }

    sb.append(str.charAt(str.length() - 1));
    sb.append(count);

    return sb.toString();
}
```

**Input:** `"aaabbcccc"`
**Output:** `"a3b2c4"`

---

# Quick Revision Table

| Problem            | Technique                 |
| ------------------ | ------------------------- |
| Toggle Case        | ASCII Difference          |
| Longest Palindrome | Expand Around Center      |
| Reverse String     | StringBuilder             |
| Reverse Words      | Split + Traverse Backward |
| Valid Palindrome   | Two Pointers              |
| Consecutive Count  | Run-Length Encoding       |

### Must-Know String Concepts

* `charAt(i)`
* `toLowerCase()`
* `toUpperCase()`
* `Character.isLetterOrDigit()`
* `StringBuilder`
* `split()`
* Two Pointer Technique
* Expand Around Center
* ASCII Manipulation
