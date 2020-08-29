package com.company.exceptionHandling.CheckedExceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked2 {
    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\Harpreet Kaur\\Documents\\FilenotfoundException.txt");
            FileInputStream filecontent = new FileInputStream(file);

            for (boolean i = true; i=filecontent.read()!=1;) {
                int val = (i) ? 1 : 0;
                char c=(char)val;
                System.out.println(val);
                System.out.println((char)val);
            }

            // methods
            System.out.println(file.canRead());
            System.out.println(file.length());
            System.out.println(file.canExecute());
            System.out.println(file.canWrite());
            System.out.println(file.exists());
            System.out.println(file.getName());
            System.out.println(file.getParentFile());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getFreeSpace());
            System.out.println(file.hashCode());
            System.out.println(file.lastModified());
            System.out.println(file.setReadOnly());


//            ________without using a while loop________

//            FileInputStream filecontent = new FileInputStream(readfile);
//            byte[] readByteFile = new byte[(int) readfile.length()];
//            filecontent.read(readByteFile);
//            filecontent.close();
//
//            String obj = new String(readByteFile,"UTF-8");
//            System.out.println(obj);


        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
