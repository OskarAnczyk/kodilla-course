package com.kodilla.good.patterns.food;

public class DeliveryService {
    private InformationService informationService;
    private DeliveryRepository deliveryRepository;

    public DeliveryService(InformationService informationService, DeliveryRepository deliveryRepository) {
        this.informationService = informationService;
        this.deliveryRepository = deliveryRepository;
    }
/*
    public boolean process(OrderRequest orderRequest, FoodSupplier foodSupplier) {
        //costam sprawdzam
        *//*
        wynik = foodSupplier.process(orderRequest);
        wysylam mail
        robie jakies rzeczy i koncze

        *//*
    }
    */

    public boolean process(OrderRequest orderRequest,FoodSupplier foodSupplier){
        boolean isDone = foodSupplier.process(orderRequest);

        if(isDone){
            informationService.inform(orderRequest);
            deliveryRepository.createDelivery(orderRequest);
            return true;
        } else {
            return false;
        }
    }
}
