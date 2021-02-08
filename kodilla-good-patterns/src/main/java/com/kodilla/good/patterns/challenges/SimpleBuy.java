package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SimpleBuy implements BuyService{
    public boolean buy(BuyRequest buyRequest){
        final LocalDateTime from = buyRequest.getFrom();
        final LocalDateTime to = buyRequest.getTo();
        if(from.isBefore(to)){
            return true;
        } else {
            return false;
        }
    }
}
