package com.company.Threadss;

public class ThreadKLocall {
    public static void main(String[] args) {
       ThreadLocal threadLocal = new ThreadLocal();
       threadLocal.set("this is thread local");

       String threadlocalValue = (String) threadLocal.get();

       threadLocal.remove();
    }
}
