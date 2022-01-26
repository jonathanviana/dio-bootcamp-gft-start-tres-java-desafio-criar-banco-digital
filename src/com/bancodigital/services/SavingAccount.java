package com.bancodigital.services;

public class SavingAccount extends Account {

    public SavingAccount(Client client) {
        super(client);
    }

    @Override
    public void extract() {
        System.out.println("##### - Extrato Conta Poupança - #####");
        super.extract();

    }
}

