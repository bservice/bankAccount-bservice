package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount myAccount = new BankAccount(234.23, "Dan");//Creates object
        myAccount.deposit(100);//goes into method
        myAccount.withdraw(30);
        System.out.println(myAccount.balance);
    }
}
