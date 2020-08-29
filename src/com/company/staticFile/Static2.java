package com.company.staticFile;

import com.company.staticFile.StaticVariableChng;
import static com.company.staticFile.StaticVariableChng.*;


public class Static2 {
    public static void main(String[] args) {
        StaticVariableChng.a=24;
        System.out.println(StaticVariableChng.a);
        method();
        m1();
    }
}
