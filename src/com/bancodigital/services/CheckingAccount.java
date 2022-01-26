package com.bancodigital.services;

public class CheckingAccount extends Account{

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void extract() {
        System.out.println("##### - Extrato Conta Corrente - #####");
        super.extract();
    }

}
