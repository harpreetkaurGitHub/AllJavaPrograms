package com.company.exceptionHandling.UncheckedExceptions;

public class IllegalArgException {
    int num , m;

    public void setMarks(int marks) {
        try {
//            if(marks < 0 || marks > 100) throw new IllegalArgumentException(Integer.toString(marks));
//            else
//                m = marks;
            if (marks < 0 || marks > 100) {
                System.out.println("Marks is greater than 100" + " " + marks);
                throw new IllegalArgumentException(String.valueOf(marks));

            }
            else {
                System.out.println("marks is smaller than 0"+ "" + marks);
            }
            System.out.println("opps");
        }

        catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("ohh gosh catched");
        }
        finally {
            System.out.println("I Love you.");
        }

        System.out.println("dfkjhdkf");
        }

    public static void main(String[] args) {

        IllegalArgException obj = new IllegalArgException();

        obj.setMarks(101);

        System.out.println(obj.m);
    }
}
