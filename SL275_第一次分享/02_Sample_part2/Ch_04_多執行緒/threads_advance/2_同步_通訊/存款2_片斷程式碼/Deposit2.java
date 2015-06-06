/**
  synchronized method ������synchronized�����q�{���X (�����Ĳv)
*/

import java.io.*;


public class Deposit2 {
  static int balance = 1000; // simulate balance kept remotely
  public static void main (String args[]) {
    PrintWriter out = new PrintWriter (System.out, true);
    Account2 account = new Account2 (out);
    DepositThread2 first, second;
    first  = new DepositThread2 (account, 1000, "#1");
    second = new DepositThread2 (account, 1000, "\t\t\t\t#2");
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


class Account2 {
  PrintWriter out;
  Account2 (PrintWriter out) {
    this.out = out;
  }
  void deposit (int amount, String name) {
    int balance;
    out.println (name + " trying to deposit " + amount);
    synchronized (this) {                                       //method ������synchronized�����q�{���X
	    out.println (name + " getting balance...");         //
	    balance = getBalance();                             //
	    out.println (name + " balance got is " + balance);  //
	    balance += amount;                                  //
	    out.println (name + " setting balance...");         //
	    setBalance (balance);                               //
    }                                                           //
    out.println (name + " new balance set to " + Deposit2.balance);
  }
  int getBalance() {
    try {   // simulate the delay in getting balance remotely
      Thread.sleep (5000);
    } catch (InterruptedException e) {}
    return Deposit2.balance;
  }
  void setBalance (int balance) {
    try {   // simulate the delay in setting new balance remotely
      Thread.sleep (5000);
    } catch (InterruptedException e) {}
    Deposit2.balance = balance;
  }
}


class DepositThread2 extends Thread {
  Account2 account;
  int    depositAmount;
  String  message;
  DepositThread2 (Account2 account, int amount, String message) {
    this.message  = message;
    this.account  = account;
    this.depositAmount = amount;
  }
  public void run() {
    account.deposit (depositAmount, message);
  }
}
