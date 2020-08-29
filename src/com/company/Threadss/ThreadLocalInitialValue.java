package com.company.Threadss;

public class ThreadLocalInitialValue {

    ThreadLocal<String> threadLocal = new ThreadLocal<>();

    protected String initialValue() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static void main(String[] args) {

    }
}
