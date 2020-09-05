package com.company.Array;

import java.util.Arrays;

public class ArrayImplementation {

    int length;
    int[] array;

    ArrayImplementation(int size) {
        this.length = 0;
        this.array = new int[size];
    }


    public static void main(String[] args) {
        ArrayImplementation arrayImplementation = new ArrayImplementation(10);
        arrayImplementation.push(10);
        arrayImplementation.push(20);
        arrayImplementation.push(30);
        arrayImplementation.delete(1);
        System.out.println(Arrays.toString(arrayImplementation.array));
    }


    public int getIndex(int index) {
        return this.array[index];
    }

    public int push(int item) {
        this.array[this.length] = item;
        this.length++;
        return this.length;
    }


    public int pop() {
        int lastIndex = this.array[this.length - 1];
        this.array[this.length - 1] = 0;
        this.length--;
        return lastIndex;
    }

    public int delete(int index) {

        int deletedElement = this.array[index];
        this.shiftElement(index);
        return deletedElement;
    }

    private void shiftElement(int index) {
        for (int i = index; i < this.array.length - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.array[this.length - 1] = 0;
        this.length--;
    }

}
