package com.company.Array;

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


    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 7, 8, 9 };
        int missingNum = getMissingNum(a, a.length);
        System.out.println(missingNum);
    }
}
