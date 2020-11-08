package com.company.DataStructure.Stack;

public class StackUsingArray {

    private int max = 1000;
    private int[] stackArray = new int[max];
    private int topElement;

    public StackUsingArray() {
        topElement = -1;
    }

    public int peek() {
        if (topElement < 0) {
            throw new StackOverflowError("Stack Under Flow");
        }
        return stackArray[topElement];
    }

    public void push(int value) {
        if (topElement >= (max-1)) {
            throw new StackOverflowError("Stack OverFlow");
        }
        stackArray[++topElement] = value;
    }

    public int pop() {
        if (topElement <= 0) {
            throw new NullPointerException("null or empty Stack");
        }
        int pop = stackArray[topElement--];
        return pop;
    }
    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        stackUsingArray.push(0);
        stackUsingArray.push(20);
        stackUsingArray.push(30);
        stackUsingArray.push(40);
        System.out.println("Peek Before : "+stackUsingArray.peek());
        stackUsingArray.pop();
        System.out.println("Peek After : "+stackUsingArray.peek());
    }
}
