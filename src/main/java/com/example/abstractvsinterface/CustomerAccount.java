package com.example.abstractvsinterface;

import com.example.abstractvsinterface.BankCalculation.ExchangeCalculation;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerAccount implements ExchangeCalculation {

    protected CustomerAccount(String str){
        System.out.println("Parents constructor called"+str);
    }

    CustomerAccountImpl customerAccount;

    @Override
    public void add() {
        System.out.println("Added");
    }

    public void goToLayerSecond(){
        CustomerAccountImpl customerAccount1=new CustomerAccountImpl();
        customerAccount1.add();
//        this.customerAccount.add();
        this.add();
    }
}
