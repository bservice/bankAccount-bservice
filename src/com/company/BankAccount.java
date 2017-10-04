package com.company;

/**
 * Created by bs666 on 10/4/17.
 */
public class BankAccount
{
    public double balance;//Variables to exist for bank accounts. These are called State Variables.
    public String name;

    public BankAccount(double b, String n)
    {
        balance = b;
        name = n;
    }

    public void deposit(double d)
    {
        balance = d + balance;
    }

    public void withdraw(double w)
    {
        balance = balance - w;
    }



}
