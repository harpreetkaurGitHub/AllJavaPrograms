package com.company.constructor;

class InvokeParaConst {

    public InvokeParaConst() {

        System.out.println("I am default");
    }

    public InvokeParaConst(int num)

    {
        System.out.println("I am Para Const" + num);

    }

}
class ChilClass extends InvokeParaConst {

    ChilClass(int i) {
//        super(i);
        System.out.println("i am child  class para const"+ i);
    }

    public ChilClass() {
//        super();
        System.out.println("i am child default const" );
    }

    void dis() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        InvokeParaConst obj3 = new InvokeParaConst(40);
        ChilClass obj = new ChilClass();
        ChilClass obj1 = new ChilClass(23);





    }
}


// TODO: 23-05-2020
//  1. Constructor - Para,def(super)
//  2. public,private *
//  3. for(int i =0 ;) (internal working)