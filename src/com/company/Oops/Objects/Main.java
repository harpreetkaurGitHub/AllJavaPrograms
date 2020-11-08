package com.company.Oops.Objects;

import com.company.Oops.staticFile.StaticVariableChng;

public class Main extends StaticVariableChng {
    private void Method() {
        System.out.println("HI i am main");
    }

    public static void main(String[] args) {

       Main obj = new Main();
        Main2 obj2 = new Main2();
        Main3 obj3 = new Main3();

        obj2.Hello();
        obj.Method();
        obj3.Hello2();


    }
}
