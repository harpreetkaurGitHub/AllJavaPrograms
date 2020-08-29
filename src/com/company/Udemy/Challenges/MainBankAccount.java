package com.company.Udemy.Challenges;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount object = new BankAccount();
        object.depositFunds(10000);
        System.out.println("You have deposited " + object.getBalance() + " in your Bank Account ");

        object.depositFunds(500);
        object.withdrawFunds(1000);

        object.withdrawFunds(1000);
        System.out.println(object.getBalance() + " Final Amount in your Bank Account");

    }

}
