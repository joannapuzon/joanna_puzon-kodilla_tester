package com.kodilla.abstracts.homework;

public class Bank {

    private CashMachine[] cashMachine;
    private int numberOfDevices;

//    [] bo mogą być wiele bankomatów

    public Bank(int numberOfDevices) {
        this.numberOfDevices = numberOfDevices;
        this.cashMachine = new CashMachine[numberOfDevices];

//        czemu wpisujemy tutaj w nawiasie kwadratowym
        for (int i = 0; i < cashMachine.length; i++) {
            cashMachine[i] = new CashMachine();

//            czemu tutaj wpisujemy new CashMachine() drugi raz

        }
    }

    public int getNumberOfDevices() {
        return numberOfDevices;
    }

    public void addTransaction(int deviceID, int amount) {


//            czemu długość z deviceID i length nie działa
    }


    public int getTotalNumberOfDeposits() {
        int sum = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sum = sum + cashMachine[i].getNumberOfDeposits();
//            czemu tak tutaj
        }
        return sum;
    }

    public int getTotalNumberOfWithdrawals() {
        int sum = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sum = sum + cashMachine[i].getNumberOfWithdrawals();
        }
        return sum;
    }

    public double getTotalAvgDeposits() {
        if (this.cashMachine.length == 0) {
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sum = sum + cashMachine[i].getAvgDeposit();
        }
        return sum / cashMachine.length;
    }

    public double getTotalAvgWithdrawals() {
        if (this.cashMachine.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sum = sum + cashMachine[i].getAvgWithdrawal();
        }
        return (sum / cashMachine.length) * -1;

//        dlaczego tak i dlaczego znow double sum?
    }

    public int getTotalBalance() {
        return
    }

    public double geTotalAvgDeposits() {

        if (this.cashMachine.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sum = sum + cashMachine[i].getAvgDeposit();
        }
        return (sum / cashMachine.length) * -1;
    }
}

