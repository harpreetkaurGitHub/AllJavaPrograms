package com.company.Collectionss.ArrayListss.All;

public class Fibonacci {

    public static void loop(int num){
        int num1=0;
        int num2=1;
        int result=0;

       while (result<num){
           System.out.println(num1);
           int num3 = num2 + num1;
           num1 = num2;
           num2 = num3;
           result = result + 1;
       }
    }

    public static int recursion(int num) {
            if(num == 0){
                return 0;
            }
            if(num == 1 || num == 2){
                return 1;
            }
            return recursion(num-2) + recursion(num-1);
        }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        loop(10);
        int maxNumber = 10;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
        for(int i = 0; i < maxNumber; i++){
            System.out.println(recursion(i) + " ");
        }
    }
}
