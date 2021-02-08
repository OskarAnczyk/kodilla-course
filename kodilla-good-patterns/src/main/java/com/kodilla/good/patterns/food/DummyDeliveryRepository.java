package com.kodilla.good.patterns.food;

public class DummyDeliveryRepository implements DeliveryRepository{
    public void createDelivery(OrderRequest orderRequest){
        System.out.println("Database updated");
    }
}
