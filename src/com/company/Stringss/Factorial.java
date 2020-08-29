package com.company.Stringss;

public class Factorial {

    public static int factorialMethod(int num , int fact) {
//        int i;
//        for(i=1;i<=num;i++){
//
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+num+" is: "+fact);


        try {
            if (num<0) {
                throw new Exception("this is not valid number"+num);
            }

            if (1 < num ) {

                fact = fact * num;

                num = num - 1;

                factorialMethod(num,fact);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return fact;
    }

    public static void main(String[] args) {

        factorialMethod(5,1);

    }
}
