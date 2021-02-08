package com.kodilla.good.patterns.food;

public class FoodMain {
    public static void main(String[] args){
        DummyDeliveryRepository dummyDeliveryRepository = new DummyDeliveryRepository();
        DummyInformationService dummyInformationService = new DummyInformationService();

        GlutenFreeShopService glutenFreeShopService = new GlutenFreeShopService();
        OrderRequest orderRequest = new OrderRequest("Deliver100",FoodType.FOOD,2000);

        DeliveryService deliveryService = new DeliveryService(dummyInformationService,dummyDeliveryRepository);

        deliveryService.process(orderRequest,glutenFreeShopService);
    }
}
