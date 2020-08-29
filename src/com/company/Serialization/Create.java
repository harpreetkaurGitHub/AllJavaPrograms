package com.company.Serialization;

import java.io.*;

public class Create implements Serializable {
    private static final long serialVersionUID = 1234L;
    public int integer;
    public String string;

    public Create(int integer,String string) {
        this.integer = integer;
        this.string = string;
    }

    public static void main(String[] args) {
        Create obj = new Create(1,"serializable");
        String filename = "file.ser";

        try {
            FileOutputStream fileinput = new FileOutputStream(filename);
            ObjectOutputStream objOutput = new ObjectOutputStream(fileinput);

            objOutput.writeObject(obj);
            objOutput.close();
            fileinput.close();
            System.out.println("Object has been serailized");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Create secondOnj = null;

        try{
            FileInputStream fileinput = new FileInputStream(filename);
            ObjectInputStream objOutput = new ObjectInputStream(fileinput);

            secondOnj = (Create) objOutput.readObject();
            objOutput.close();
            fileinput.close();

            System.out.println("Object has been deserialized");
            System.out.println("String :: " + secondOnj.string);
            System.out.println("Ïnteger :: "+ secondOnj.integer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
