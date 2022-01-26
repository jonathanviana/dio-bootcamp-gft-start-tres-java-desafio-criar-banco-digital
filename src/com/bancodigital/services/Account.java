package com.bancodigital.services;

public abstract class Account implements AccountsInterface {

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
    public void pix(double value, AccountsInterface destinationAccount) {
        this.take(value);
        destinationAccount.put(value);
    }

    protected void extractInfo() {
        System.out.println();
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("Agência: %d", + this.agency));
        System.out.println(String.format("Conta: %d", + this.accountNumber));
        System.out.println(String.format("Saldo: %.2f", + this.balance));
        System.out.println();
    }
}


