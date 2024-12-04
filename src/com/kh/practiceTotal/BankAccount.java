package com.kh.practiceTotal;

public class BankAccount {
    private String accountNo;
    private int balance;

    public BankAccount() {
    }

    public BankAccount(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "com.kh.practiceTotal.BankAccount{" +
                "accountNo='" + accountNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
