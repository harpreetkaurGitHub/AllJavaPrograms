package com.company.Access;
import com.company.constructor.Parameterised.ParaPadosi;

public class Parameterised {
    int i,d;

   protected Parameterised(int a,int b) {
        this.i = a;
        this.d = b;
   }

    protected Parameterised() {
        String v = "Hi i am not free";

        System.out.println(v);
    }

    void Hello() {
        System.out.println("Name:" +i+ " " + "Class" +d );
    }

    public static void main(String[] args) {

       Parameterised obj = new Parameterised(1,2);
       Parameterised obj1 = new Parameterised(3,4);

       obj.Hello();
       obj1.Hello();

       ParaPadosi obj3 = new ParaPadosi();

       obj3.hi();


    }
}
