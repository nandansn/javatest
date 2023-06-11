package com.nanda.oops.datahiding;

import java.util.Arrays;
import java.util.List;

public class TestBankAccount {
    public static void main(String[] args) {
       List<BankAccount> accounts =  Arrays.asList(new BankAccount[]{
                new BankAccount(123, 5000),
                new BankAccount(423, 5000),
               new BankAccount(412, 2000),
               });


       accounts.forEach(account -> {
           account.withdraw(5000);
       });

    }
}
