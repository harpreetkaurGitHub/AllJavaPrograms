package com.company.exceptionHandling.UncheckedExceptions;

public class Runtime {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Hi");
        System.out.println("I love you Sahil");
        try {
//           throw new CustomException("I love you sahil");


        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        catch (Exception e) {
            e.getMessage();
        }

    }
}
