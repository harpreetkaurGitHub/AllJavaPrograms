package com.company.Stack;

class TestInterface1 extends TestInterface2 {

    public TestInterface1() {
        super();
    }

    public void show() {
        super.show();
        System.out.println("Default TestInterface1");
    }
}

class TestInterface2 {

    public TestInterface2() {
        super();
    }

    public void show() {
        System.out.println("Default TestInterface2");
    }
}

// Implementation class code
class TestClass extends TestInterface1 {

    // Overriding default show method
    public void show() {
    super.show();
    }

    public static void main(String args[]) {
    }
}

