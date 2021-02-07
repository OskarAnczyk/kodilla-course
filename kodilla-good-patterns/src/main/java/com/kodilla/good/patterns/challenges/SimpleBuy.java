package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SimpleBuy implements BuyService{
    public boolean buy(User user, LocalDateTime from, LocalDateTime to){
        if(from.isBefore(to)){
            return true;
        } else {
            return false;
        }
    }
}
