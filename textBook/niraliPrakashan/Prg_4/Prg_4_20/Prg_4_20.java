import java.lang.*;
import java.io.*;
import java.util.*;

class ThreadSafeBankAccount{
    private double balance;
    private int number;

    public ThreadSafeBankAccount(int num, double intitalBalance){
        balance = intitalBalance;
        number = num;
    }

    public int getNumber(){
        return number;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        synchronized(this){
            double prevBalance = balance;

            try{
                Thread.sleep(4000);
            }catch(InterruptedException e){}

            balance = prevBalance + amount;
        }
    }
    public void withdraw(double amount){
        synchronized(this){
            double prevBalance = balance;

            try{
                Thread.sleep(40000);
            }catch(InterruptedException e){}

            balance = prevBalance - amount;
        }
    }
};

class LazyTeller extends Thread{
    private ThreadSafeBankAccount source, dest;

    public LazyTeller(ThreadSafeBankAccount a, ThreadSafeBankAccount b){
        source = a;
        dest = b;
    }

    public void run(){
        transfer(250.00);
    }
    public void transfer(double amount){
        System.out.println("Transferring from " + source.getNumber() + " to " + dest.getNumber());

        synchronized(source){
            Thread.yield();

            synchronized(dest){
                System.out.println("Withdrawing from " + source.getNumber());
                source.withdraw(amount);
                System.out.println("Depositing into " + dest.getNumber());
                dest.deposit(amount);
            }
        }
    }
};

public class Prg_4_20{
    public static void main(String[] args){
        System.out.println("Creating two bank accounts...");
        ThreadSafeBankAccount checking = new ThreadSafeBankAccount(101, 1000.00);
        ThreadSafeBankAccount saving = new ThreadSafeBankAccount(102, 5000.00);
        System.out.println("Creating two teller threads...");
        Thread teller1 = new LazyTeller(checking, saving);
        Thread teller2 = new LazyTeller(saving, checking);
        System.out.println("Starting both threads...");
        teller1.start();
        teller2.start();
    }
};