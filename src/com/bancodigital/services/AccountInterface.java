package com.bancodigital.services;

public interface AccountInterface {

    void take(double value);
    void put(double value);
    void pix(double value, AccountInterface destinationAccount);
    void extract();

}

