package com.bilibili.shopping;

import java.util.Scanner;

public class chinaBankCard implements bankCard{

    private int cardId = 18120401;
    private int password = 123456;
    private double balance = 2000;

    final static String type = "中国银行";

    Scanner in = new Scanner(System.in);

    public chinaBankCard(){
        System.out.println("中国银行为您服务：");
    }

    public void bind() {
        System.out.println("请输入银行卡账号:");
        cardId = in.nextInt();
        System.out.println("请输入该卡密码:");
        int pw = in.nextInt();
        if(pw == password) {
            System.out.println("卡号：" + cardId + "绑定成功,"+"您的银行卡余额为："+balance);
        }
        else {
            System.out.println("绑定失败，请检查您的卡号和密码");
        }
    }

    public void cardPay(double money) {
        if(cardId != 0) {
            System.out.println("请输入该卡密码:");
            int pw = in.nextInt();
            if(pw == password) {
                if(money <= balance) {
                    balance -= money;
                    System.out.println("支付成功，余额为："+balance);
                }
                else {
                    System.out.println("余额不足");
                }
            }
            else {
                System.out.println("密码错误！");
            }
        }
        else {
            System.out.println("您未绑定银行卡");
        }
    }

    public int getPw() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCardID() {
        return cardId;
    }

    public void balancePay(double money) {

    }
}
