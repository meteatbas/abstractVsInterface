package com.example.abstractvsinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractVsInterfaceApplication {

    Account account;

    public static void main(String[] args) {

        SpringApplication.run(AbstractVsInterfaceApplication.class, args);
//        System.out.println("dd");

        try {
            TicketMaster ticketMaster = new TicketMaster();
            ticketMaster.run();
            ticketMaster.add();

        } catch (Exception exception) {

        }
    }

}
