package com.company.Collectionss.ArrayListss.All;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {
        int i =0;
        int num =0;

        ArrayList<Integer> prime = new ArrayList<>();

        for (i = 1; i <= 100; i++)
        {
            int counter=0;
            for(num = i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                prime.add(i);
            }
        }
        System.out.println("21st Prime number: "+ prime.get(20));
    }
}
