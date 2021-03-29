package com.kodilla.abstracts.homework;

public class CashMachine {

    private int[] transactions;
    private int size;

//    [] ilość?
//    czemu private na początku?

    public CashMachine(){
        this.transactions = new int[0];
        this.size = 0;
//        dlaczego daje się na początku rozmiar 0 itd?
    }

    public void addTransaction(int amount){
        if ((getBalance() + amount) >= 0){
            this.size++;
            int[] tempTab = new int[size];
            System.arraycopy(transactions,0,tempTab,0,transactions.length);
            tempTab[size -1] = amount;
            this.transactions = tempTab;

//                     czemu podwójny nawias
//                    2 ostatnie linijki,
//                    (czemu dwa razy przypisujemy do tabelki, amount itd.)
        }
    }

    public int[] getTransactions(){
        return transactions;
    }

    public int getBalance(){
        int sum = 0;
        for(int i = 0; i <transactions.length; i++){
        sum = sum + transactions[i];
        }
        return sum;
    }

    public int getNumberOfDeposits(){
        int count = 0;
        for (int i = 0; i < transactions.length; i++){
            if(transactions[i] > 0){
                count++;
            }
        }
        return count;

//       czemu zwracamy count? do czego potrzebne
    }

    public int getNumberOfWithdrawals(){
        int count = 0;
        for (int i = 0; i < transactions.length; i++){
            if(transactions[i]<0) {
                count++;
            }
            }
        return count;
        }

        public double getAvgDeposit(){
        if(this.transactions.length == 0){
            return 0;

//            czemu tak average deposit, nie dzieli się tylko 0?
        }

        if (getNumberOfDeposits() == 0){
            return 0;

//            dlaczego tutaj dopisujemy if
        }

//        tutaj całosć czemu dwa razy double sum

        double sum = 0;
        for(int i = 0; i < transactions.length; i++){
            if (transactions[i] > 0){
                sum = sum + transactions[i];
            }
        }
        return sum / getNumberOfDeposits();
    }

    public double getAvgWithdrawal(){
        if(this.transactions.length == 0){
            return 0;
        }

        if(getNumberOfWithdrawals() == 0){
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < transactions.length; i++){
        if (transactions[i] < 0){
            sum = sum + transactions[i];
        }
        }
        return (sum/getNumberOfWithdrawals());
    }
}