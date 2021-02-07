package com.kodilla.good.patterns.challenges;

public class InformUser implements InformationService{
    public void inform(User user){
        System.out.println("Zamowienie zrealizowane dla: " + user.getName() + " " + user.getLastName());
    }
}
