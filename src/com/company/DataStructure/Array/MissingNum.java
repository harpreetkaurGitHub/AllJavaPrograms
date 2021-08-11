package com.company.DataStructure.Array;

public class MissingNum {
    static int getMissingNum(int a[], int n)
    {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++){
            total -= a[i];
        }
        return total;
    }

    static int getMissingNo(int a[], int n)
    {
        int total = 1;
        for (int i = 2; i <= (n + 1); i++)
        {
            total += i;
            total -= a[i - 2];
        }
        return total;
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 7, 8, 9 };
        int missingNum = getMissingNum(a, a.length);
        System.out.println(missingNum);
        System.out.println(getMissingNo(a,a.length));
    }
}
