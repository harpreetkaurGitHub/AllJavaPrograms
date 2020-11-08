package com.company.DataStructure.Stack;

public class CreateStack {
    int[] array= new int[6];
    int top =0;

    public void push(int value){
            array[top] = value;
            top++;
    }
    public int pop(){
         int remove = array[top--];
         return remove;
    }
    public int peek(){
        return array[top-1];
    }

    public static void main(String[] args) {
        CreateStack obj = new CreateStack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.peek());
    }
}
