package com.company.exceptionHandling.CheckedExceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally {

    public static void main(String[] args) {

        try {
                File file = new File("C:\\Users\\Harpreet Kaur\\Documents\\FilenotfoundException.txt");
                FileInputStream obj = new FileInputStream(file);
                byte[] readByteFile = new byte[(int) file.length()];
                obj.read(readByteFile);
                String string = new String(readByteFile,"UTF-8");
                System.out.println(string);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File exception catched");
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("io exceptio catched");
        }
        finally {
            System.out.println("I am finally block");
            }
        }
    }

