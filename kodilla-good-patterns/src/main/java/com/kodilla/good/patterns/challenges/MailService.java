package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService{

    @Override
    public void inform(Buyer buyer) {
        System.out.println("Mail to: " + buyer.getName() + " " + buyer.getLastName() + " has been send.");
    }
}
