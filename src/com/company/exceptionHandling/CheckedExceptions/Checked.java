package com.company.exceptionHandling.CheckedExceptions;


import java.io.*;

public class Checked {

    public static void main(String[] args) {
        int i;
        try {
            File readfile = new File("C:\\Users\\Harpreet Kaur\\Documents\\FilenotfoundException.txt");


//            while((i=readfile.read())!=-1){
//                System.out.print((char) i);
//            }



//            ________without using a while loop________

            FileInputStream filecontent = new FileInputStream(readfile);
            byte[] readByteFile = new byte[(int) readfile.length()];
            filecontent.read(readByteFile);
            filecontent.close();

            String obj = new String(readByteFile,"UTF-8");
            System.out.println(obj);


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
