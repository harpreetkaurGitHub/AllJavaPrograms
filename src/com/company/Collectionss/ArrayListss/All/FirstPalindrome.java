package com.company.Collectionss.ArrayListss.All;

public class FirstPalindrome {
    public static int isPalindrome(int n) {
        int rev = 0;
        for (int i = n; i > 0; i /= 10) {
            rev = rev * 10 + i % 10;
        }
        return (n == rev) ? 1 : 0;
    }

    public static void countPal(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (isPalindrome(i) == 1)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        countPal(10,100);
    }
}
