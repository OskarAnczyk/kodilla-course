package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface BuyRepository {
    void createBuy(BuyRequest buyRequest);
}
