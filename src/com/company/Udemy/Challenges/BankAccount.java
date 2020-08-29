package com.company.Udemy.Challenges;

public class BankAccount {
    private int phoneNumber;
    private int accountNumber;
    private String email;
    private String customerName;
    private int balance;

    // Phone number
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Account Number
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Customer Name
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Balance
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void depositFunds(int newAmount) {
        this.balance = balance + newAmount;
    }

    public void withdrawFunds(int DeductAmount) {
        if (balance < 500) {
            System.out.println("You have insufficient balance");
        }
        this.balance = balance - DeductAmount;
    }
}
