package com.company.DataStructure.Stack.Revision;

public class StackArray {
    int max = 10;
    int[] array = new int[max];
    int topElement;
    public StackArray() {
        topElement = -1;
    }
    public void push(int value){
        if (topElement >= max-1){
            throw new StackOverflowError("Stack over flow");
        }
        array[++topElement] = value;
    }

    public int pop(){
        if (topElement < 0) {
            throw new StackOverflowError("stack underflow");
        }
        int pop = array[topElement--];
        return pop;
    }

    public int peek(){
        if (topElement < 0) {
            throw new StackOverflowError("Stack underflow");
        }
        return array[topElement];
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray();
        stackArray.push(10);
        stackArray.push(44);
        stackArray.push(14);
        stackArray.push(78);

        System.out.println("peek before : "+stackArray.peek());
        System.out.println("pop : "+stackArray.pop());
        System.out.println("peek after :: "+stackArray.peek());
    }
}
