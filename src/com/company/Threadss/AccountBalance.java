package com.company.Threadss;

public class AccountBalance implements Runnable {
    private static ThreadLocal threadLocal = new ThreadLocal();
    int accountBalance = 5000;
    int limit = 500;
    @Override
    public void run() {
        makeWidrawal(4000);
    }
    private synchronized void makeWidrawal(int amount) {
        if (amount >= limit && amount<accountBalance) {
            System.out.println(Thread.currentThread().getName() + " is going to widhraw money " + amount );
            try {
                Integer threadLocalValue = (Integer) threadLocal.get();
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " is complete with transaction");
                System.out.println(threadLocalValue);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            accountBalance = accountBalance - amount;
        }
        else {
            System.out.println(Thread.currentThread().getName()+" sorry you dont have enough money in your account");
        }
    }


    public static void main(String[] args) {
        AccountBalance accountBalanceObj = new AccountBalance();
        Thread threadObj = new Thread(accountBalanceObj);
        Thread threadObj1 = new Thread(accountBalanceObj);


        threadLocal.set(123233443);
        threadObj.setName("john");
        threadObj1.setName("Max");
        threadObj.start();
        threadObj1.start();
    }
}
