package com.company.constructor;



public class InvokeParentConst {
    InvokeParentConst(int i) {
        System.out.println("I am default constructor");
    }

    public InvokeParentConst() {

    }
}
        class Child extends InvokeParentConst {
           public Child() {
               super();
               System.out.println("I am child constructor");
            }

           public Child(String milk)
            {
                super();
                System.out.println("I am arg constructor");
            }


            public static void main(String[] args) {

                Child obj = new Child();

                Child obj2 = new Child("Taken");
            }
        }

