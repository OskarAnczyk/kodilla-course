package com.kodilla.good.patterns.challenges;

public class BuyDto {
    User user;
    boolean isBought;

    public BuyDto(User user, boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }
}
