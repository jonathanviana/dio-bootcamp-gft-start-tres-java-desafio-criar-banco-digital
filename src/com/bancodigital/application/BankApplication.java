package com.bancodigital.application;

import com.bancodigital.services.*;

public class BankApplication {
    public static void main(String[] args) {

        Client buyer = new Client();
        buyer.setName("Comprador");

        Client seller = new Client();
        seller.setName("Vendedor");

        AccountInterface ca = new CheckingAccount(buyer);
        AccountInterface sa = new SavingAccount(seller);

        ca.pix(100.00,sa);
        ca.take(200.00);
        ca.put(350.00);

        sa.take(200.00);
        sa.pix(50.00,ca);
        sa.put(300.00);

        ca.extract();
        sa.extract();

    }
}


