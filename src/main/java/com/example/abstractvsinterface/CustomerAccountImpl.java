package com.example.abstractvsinterface;

public class CustomerAccountImpl extends CustomerAccount {

        protected CustomerAccountImpl(){
            super(" this time for customer");
            System.out.println("Customer account constructor");
        }

    @Override
    public void add() {
        System.out.println("In The Impl");
//        this.goToLayerSecond();
    }
}
