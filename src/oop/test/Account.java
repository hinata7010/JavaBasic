package oop.test;

public class Account {
    int balance;

    public void deposit(int money)
    {
        this.balance += money;
        System.out.println("당신이 입금한 금액 " + money);
        System.out.println("현재 잔액 " + this.balance);
    }
}
