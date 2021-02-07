package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface BuyService {
    boolean buy(User user, LocalDateTime from, LocalDateTime to);
}
