package com.example.coincointracker.Model;

/**
 * Created by Frederic THOS - EXPELOGROUP on 08/04/2021
 */
public class Wallet {
    private double mBalance;
    public static final double CAPACITY = 30.0;

    public Wallet(double initialBalance) {
        mBalance = initialBalance;
    }

    public void deposit(double amount) throws Exception {
        if ((mBalance + amount) > CAPACITY) {
            throw new Exception("Too many coins!");
        }
        mBalance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > mBalance) {
            throw new Exception("not enaugh cash!");
            }
        mBalance -= amount;
        }

        public double getBalance() {
        return mBalance;
        }
}
