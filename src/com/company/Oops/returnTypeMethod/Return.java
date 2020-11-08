package com.company.Oops.returnTypeMethod;

public class Return {
    int i,v;

    public Return( int f , int g) {
        this.i=f;
        this.v=g;
    }
    void Return2() {
        System.out.println("Rollno"+i+" "+ "id"+v);
    }

    public int Sum() {
        int a = 10;
        int b = 20;
        int sum = a+b;

        return sum;
    }

    public String Concat() {
        String a = "A";
        String b = "B";
        String Concat = a+b;

        return Concat;
    }

    public Double Point() {
        Double a = 3.0;
        Double b = 4.0;
        Double c = a + b;

        return c;

    }

    public static void main(String[] args) {

        Return obj2 = new Return(22,33);

        obj2.Return2();
//        System.out.println(obj.Sum());

//        Return obj = new Return();
//
//        System.out.println(obj.Concat());
//
//        System.out.println(obj.Point());
    }
}
