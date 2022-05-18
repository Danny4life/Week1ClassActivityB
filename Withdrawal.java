package org.codewithjindu;

import java.util.ArrayList;

public class Withdrawal extends CashNote implements WithdrawalInterface{
    ArrayList<Integer> listOfCash = new ArrayList<>();

    @Override
    public String withdraw(CashNote cashNote) {
        ArrayList<Integer> currency = new ArrayList<>();

        if (listOfCash.contains())
        int hundred = amount / 1000;
        int remainder = amount % 1000;

        return currency;
        ArrayList<Integer> listOfCash = new ArrayList<>();

        return null;
    }
//
//    public ArrayList<Integer> numberOfOneThousand(int amount) {
//        ArrayList<Integer> currency = new ArrayList<>();
//        int hundred = amount / 1000;
//        int remainder = amount % 1000;
//
//        return currency;
//    }

    public ArrayList<Integer> numberOfFiveHundred(int amount) {
        ArrayList<Integer> currency = new ArrayList<>();
        int hundred = amount / 500;
        int remainder = amount % 500;

        return currency;
    }

    public ArrayList<Integer> numberOfTwoHundred(int amount) {
        ArrayList<Integer> currency = new ArrayList<>();
        int hundred = amount / 200;
        int remainder = amount % 200;

        return currency;
    }

    public ArrayList<Integer> numberOfOneHundred(int amount) {
        ArrayList<Integer> currency = new ArrayList<>();
        int hundred = amount / 100;
        int remainder = amount % 100;

        return currency;
    }

    public ArrayList<Integer> numberOfFifty(int amount) {
        ArrayList<Integer> currency = new ArrayList<>();
        int hundred = amount / 50;
        int remainder = amount % 50;

        return currency;
    }

    public ArrayList<Integer> numberOfTwenty(int amount) {
        ArrayList<Integer> currency = new ArrayList<>();
        int hundred = amount / 20;
        int remainder = amount % 20;

        return currency;
    }

    public ArrayList<Integer> numberOfTen(int amount) {
        ArrayList<Integer> currency = new ArrayList<>();
        int hundred = amount / 10;
        int remainder = amount % 10;

        return currency;
    }

    public ArrayList<Integer> numberOfFive(int amount) {
        ArrayList<Integer> currency = new ArrayList<>();
        int hundred = amount / 5;
        int remainder = amount % 5;

        return currency;
    }

}
