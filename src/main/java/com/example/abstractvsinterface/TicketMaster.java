package com.example.abstractvsinterface;

import com.example.abstractvsinterface.BankCalculation.BankCalculation;
import com.example.abstractvsinterface.BankCalculation.ExchangeCalculation;

public class TicketMaster implements ExchangeCalculation, BankCalculation {

    public void run(){
        Account account=new Account() {};
        account.add();
        CustomerAccount customerAccount=new CustomerAccount("go to customer");
        customerAccount.goToLayerSecond();
//        account.subtract();
        System.out.println("run ticket engines");
    }

    @Override
    public void add() {
        System.out.println("ticket added");
    }
}
