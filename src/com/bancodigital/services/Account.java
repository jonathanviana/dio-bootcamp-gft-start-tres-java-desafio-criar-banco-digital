package com.bancodigital.services;

public abstract class Account implements AccountInterface {

    private static final int DEFAULT_AGENCY = 42;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int accountNumber;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY;
        this.accountNumber = SEQUENTIAL++;
        this.balance = 1000.00;
        this.client = client;
    }

    @Override
    public void take(double value) {
        this.balance-=value;

    }

    @Override
    public void put(double value) {
        this.balance+=value;

    }

    @Override
    public void pix(double value, AccountInterface destinationAccount) {
        this.take(value);
        destinationAccount.put(value);
    }

    public void extract() {
        System.out.printf("\nTitular: %s\nAgência: %d\nConta: %d\ndSaldo: R$ %,.2f\n\n", this.client.getName(), this.agency, this.accountNumber, this.balance);
    }
}


