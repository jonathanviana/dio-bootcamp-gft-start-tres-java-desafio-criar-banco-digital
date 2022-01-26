package com.bancodigital.services;

public interface AccountsInterface {

    void take(double value);
    void put(double value);
    void pix(double value, AccountsInterface destinationAccount);
    void extract();

}

