/**
  synchronized 整個存款 method (class Account1 之 deposit() method)
*/

import java.io.*;


public class Deposit1 {
  static int balance = 1000; // simulate balance kept remotely
  public static void main (String args[]) {
    PrintWriter out = new PrintWriter (System.out, true);
    Account1 account = new Account1 (out);
    DepositThread1 first, second;
    first  = new DepositThread1 (account, 1000, "#1");
    second = new DepositThread1 (account, 1000, "\t\t\t\t#2");
    // start the transactions
    first.start();
    second.start();
    // wait for both transactions to finish
    try {
      first.join();
      second.join();
    } catch (InterruptedException e) {}
    // print the final balance
    out.println ("*** Final balance is " + balance);
  }
}


class Account1 {
  PrintWriter out;
  Account1 (PrintWriter out) {
    this.out = out;
  }
  synchronized void deposit (int amount, String name) {    //synchronized 整個存款 method
    int balance;
    out.println (name + " trying to deposit " + amount);
    out.println (name + " getting balance...");
    balance = getBalance();
    out.println (name + " balance got is " + balance);
    balance += amount;
    out.println (name + " setting balance...");
    setBalance (balance);
    out.println (name + " new balance set to " + Deposit1.balance);
  }
  int getBalance() {
    try {   // simulate the delay in getting balance remotely
      Thread.sleep (5000);
    } catch (InterruptedException e) {}
    return Deposit1.balance;
  }
  void setBalance (int balance) {
    try {   // simulate the delay in setting new balance remotely
      Thread.sleep (5000);
    } catch (InterruptedException e) {}
    Deposit1.balance = balance;
  }
}


class DepositThread1 extends Thread {
  Account1 account;
  int    depositAmount;
  String  message;
  DepositThread1 (Account1 account, int amount, String message) {
    this.message  = message;
    this.account  = account;
    this.depositAmount = amount;
  }
  public void run() {
    account.deposit (depositAmount, message);
  }
}
