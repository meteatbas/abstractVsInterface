package com.example.abstractvsinterface;

import com.example.abstractvsinterface.BankCalculation.BankCalculation;
import com.example.abstractvsinterface.BankCalculation.ExchangeCalculation;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class Account implements  ExchangeCalculation  {

    @Override
    @Qualifier(value = "ExchangeCalculation")
    public void add() {
        System.out.println("hehe");
    }
}
