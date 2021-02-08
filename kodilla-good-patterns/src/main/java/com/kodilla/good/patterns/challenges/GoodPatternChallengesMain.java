package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class GoodPatternChallengesMain {
    public static void main(String[] args){

//        MovieStore movieStore = new MovieStore();
//        movieStore.showAllMovies();


        InformUser informUser = new InformUser();
        FakeDatabase fakeDatabase = new FakeDatabase();
        SimpleBuy simpleBuy = new SimpleBuy();

        User user = new User("Jan", "Nowak");
        LocalDateTime from = LocalDateTime.now();
        LocalDateTime to = LocalDateTime.now().plusDays(10);

        BuyRequest buyRequest = new BuyRequest(user,from,to);
        ProductOrderService productOrderService = new ProductOrderService(informUser,simpleBuy,fakeDatabase);

        productOrderService.process(buyRequest);
    }
}
