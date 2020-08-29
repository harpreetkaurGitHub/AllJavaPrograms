package com.company.Stringss.StringBufferPkg;

public class New1 {

    static StringBuffer stringBuffer = new StringBuffer("happy");
    static StringBuffer stringBuffer2 = new StringBuffer("Happy Rollno :: ");
    static StringBuffer stringBuffer3 = new StringBuffer("1602964444");
    static StringBuffer stringBuffer4 = new StringBuffer("StaySafe");
    static StringBuffer stringBuffer5 = new StringBuffer("Now its Enough");
    static StringBuffer stringBuffer6 = new StringBuffer("23445555");

    public static void main(String[] args) {

        stringBuffer.append(" happy");
        System.out.println(stringBuffer);

        stringBuffer2.append(1602964);
        System.out.println(stringBuffer2);

        stringBuffer3.delete(6,9);
        System.out.println("your roll number is updated :: " + stringBuffer3);

        stringBuffer4.insert(4, "---------");
        System.out.println(stringBuffer4);

        stringBuffer5.reverse();
        System.out.println(stringBuffer5);

        stringBuffer6.toString();
        System.out.println(stringBuffer6);   //useless method
    }
}
