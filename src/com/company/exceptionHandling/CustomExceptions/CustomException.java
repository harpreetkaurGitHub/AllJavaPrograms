package com.company.exceptionHandling.CustomExceptions;

public class CustomException {

    public CustomException(int num) {

    }
    public void display() throws Exception {

            display1();
    }
    public void display1() throws Exception {
        throw new LoveYouException("I love you My Friends ");
    }

    public static void main(String[] args) {
        try {
         CustomException customException  = new CustomException(10);
         customException.display();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
