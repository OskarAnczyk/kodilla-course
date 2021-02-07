package com.kodilla.good.patterns.challenges;

public class FakeDatabase implements BuyRepository{
    public void createBuy(BuyRequest buyRequest){
        System.out.println("Zapisano w bazie danych transakcje:\n" + buyRequest.getUser().toString()
                + "\n" + buyRequest.getFrom()
                + "\n" + buyRequest.getTo());
    }
}
