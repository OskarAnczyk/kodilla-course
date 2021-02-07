package com.kodilla.good.patterns.food;

public class HealthyShopService implements ProducentOrderService{
    public boolean process(OrderRequest orderRequest){
        if(orderRequest.getFoodType() == FoodType.FOOD || orderRequest.getFoodType() == FoodType.DRINK){
            System.out.println("Delivery provided by: " + orderRequest.getDeliveryName() + " from: HealthyShop"
                    + "/nfor:" + orderRequest.getAmountInGrams() + " of " + orderRequest.getFoodType() + ".");
            return true;
        } else {
            return false;
        }
    }
}
